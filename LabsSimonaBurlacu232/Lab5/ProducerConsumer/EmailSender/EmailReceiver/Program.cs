using RabbitMQ.Client;
using RabbitMQ.Client.Events;
using System;
using System.Text;

namespace EmailReceiver
{
    public class Program
    {
        private static readonly string QUEUE_NAME = "email_queue";
        static void Main(string[] args)
        {
            var mailService = new MailService();
            var factory = new ConnectionFactory() { HostName = "localhost" };
            using (var connection = factory.CreateConnection())
            {
                using (var channel = connection.CreateModel())
                {
                    channel.QueueDeclare(queue: QUEUE_NAME, durable: true, exclusive: false, autoDelete: false, arguments: null);
                    //don't dispatch a new message to a worker until it has processed and acknowledged the previous one
                    channel.BasicQos(prefetchSize: 0, prefetchCount: 1, global: false);
                    Console.WriteLine("Worker: Waiting for messages.");
                    var consumer = new EventingBasicConsumer(channel);
                    consumer.Received += (model, ea) =>
                    {
                        Console.WriteLine("Worker:Received messages.");
                        var body = ea.Body;
                        var message = Encoding.UTF8.GetString(body);
                        mailService.SendEmail(message);
                        channel.BasicAck(deliveryTag: ea.DeliveryTag, multiple: false);
                    };
                    channel.BasicConsume(queue:QUEUE_NAME, autoAck: false, consumer: consumer);
                    Console.ReadKey();
                }
            }
        }
    }
}
