using RabbitMQ.Client;
using System;
using System.Collections.Generic;
using System.Text;

namespace NotificationSender
{
    public class Program
    {
        private static readonly int NR_MSGS = 10;
        private static readonly string EX_NAME = "notification_exchange";
        static void Main(string[] args)
        {
            var factory = new ConnectionFactory() { HostName = "localhost" };
            using (var connection = factory.CreateConnection())
            {
                using (var channel = connection.CreateModel())
                {
                    channel.ExchangeDeclare(exchange: EX_NAME, type: "direct");
                    var msgs = GetMessages(NR_MSGS);
                    foreach (var message in msgs)
                    {
                        var notificationType = GetRandomNotificationType();
                        var body = Encoding.UTF8.GetBytes(message);
                        channel.BasicPublish(exchange: EX_NAME, routingKey: notificationType, basicProperties: null, body: body);
                        Console.WriteLine($" Sent '{notificationType}':'{message}'");
                    }
                }
            }

            Console.WriteLine("Done");
            Console.ReadLine();
        }

        public static string GetRandomNotificationType()
        {
            var types = new List<string>() { "email", "sms", "push" };
            var random = new Random();
            return types[random.Next(0, types.Count)];
        }

        private static IList<string> GetMessages(int count)
        {
            var msgs = new List<string>();
            while (count > 0)
            {
                msgs.Add($" Mail {count}");
                count--;
            }
            return msgs;
        }
    }
}
