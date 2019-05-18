using RabbitMQ.Client;
using RabbitMQ.Client.Events;
using System;
using System.Collections.Generic;
using System.Text;

namespace NotificationConsumer
{
    class Program
    {
        private static readonly string EX_NAME = "notification_exchange";
        static void Main(string[] args)
        {
            var factory = new ConnectionFactory() { HostName = "localhost" };
            using (var connection = factory.CreateConnection())
            using (var channel = connection.CreateModel())
            {
                channel.ExchangeDeclare(exchange: EX_NAME, type: "direct");
                var queueName = channel.QueueDeclare().QueueName;

                var notificationType = GetRandomNotificationType();
                channel.QueueBind(queue: queueName, exchange: EX_NAME, routingKey: notificationType);

                Console.WriteLine($"Waiting for notifications of type {notificationType}");

                var consumer = new EventingBasicConsumer(channel);
                consumer.Received += (model, ea) =>
                {
                    var body = ea.Body;
                    var message = Encoding.UTF8.GetString(body);
                    var routingKey = ea.RoutingKey;
                    Console.WriteLine("Received '{0}':'{1}'", routingKey, message);
                };
                channel.BasicConsume(queue: queueName, autoAck: true, consumer: consumer);

                Console.WriteLine(" Press [enter] to exit.");
                Console.ReadLine();
            }
        }

        public static string GetRandomNotificationType()
        {
            var types = new List<string>() { "email", "sms", "push" };
            var random = new Random();
            return types[random.Next(0, types.Count)];
        }
    }
}
