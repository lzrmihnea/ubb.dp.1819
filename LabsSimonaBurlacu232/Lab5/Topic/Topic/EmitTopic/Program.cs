using RabbitMQ.Client;
using System;
using System.Collections.Generic;
using System.Text;

namespace EmitTopic
{
    class Program
    {
        private static readonly int NR_MSGS = 10;
        private static readonly string EX_NAME = "topic_exchange";

        static void Main(string[] args)
        {
            var factory = new ConnectionFactory() { HostName = "localhost" };
            using (var connection = factory.CreateConnection())
            using (var channel = connection.CreateModel())
            {
                channel.ExchangeDeclare(exchange: EX_NAME, type: "topic");
                var msgs = GetMessages(NR_MSGS);
                var notificationType = "email";
                foreach (var message in msgs)
                {
                    var region = GetRandomRegion();
                    var routingKey = notificationType + "." + region;
                    var body = Encoding.UTF8.GetBytes(message);
                    channel.BasicPublish(exchange: EX_NAME, routingKey: routingKey, basicProperties: null, body: body);
                    Console.WriteLine(" Sent '{0}':'{1}'", routingKey, message);
                }
            }
            Console.ReadLine();
        }

        public static string GetRandomRegion()
        {
            var types = new List<string>() { "usa", "europe"};
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
