using RabbitMQ.Client;
using System;
using System.Collections.Generic;
using System.Text;

namespace EmailSender
{
    public class Program
    {
        private static readonly int NR_MSGS = 10;
        private static readonly string QUEUE_NAME = "email_queue";
        static void Main(string[] args)
        {
            var factory = new ConnectionFactory() { HostName = "localhost" };
            using (var connection = factory.CreateConnection())
            {
                using (var channel = connection.CreateModel())
                {
                    channel.QueueDeclare(queue: QUEUE_NAME, durable: true, exclusive: false, autoDelete: false, arguments: null);

                    var msgs = GetMessages(NR_MSGS);
                    foreach(var message in msgs)
                    {
                        var body = Encoding.UTF8.GetBytes(message);
                        var properties = channel.CreateBasicProperties();
                        properties.Persistent = true;
                        channel.BasicPublish(exchange: "", routingKey: QUEUE_NAME, basicProperties: properties, body: body);
                        Console.WriteLine($"Sending {message} to {QUEUE_NAME}");
                    }
                }
            }
            Console.WriteLine("Hello World!");
            Console.ReadKey();
        }

        private static IList<string> GetMessages(int count)
        {
            var msgs = new List<string>();
            while(count>0)
            {
                msgs.Add($" Mail {count}");
                count--;
            }
            return msgs;
        }
    }
}
