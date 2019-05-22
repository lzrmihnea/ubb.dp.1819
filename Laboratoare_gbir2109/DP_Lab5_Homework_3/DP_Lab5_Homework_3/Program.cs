using RabbitMQ.Client;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DP_Lab5_Homework_3
{
    class Program
    {
        static void Main(string[] args)
        {
            var factory = new ConnectionFactory() { HostName = "localhost" };
            using (var connection = factory.CreateConnection())
            using (var channel = connection.CreateModel())
            {
                channel.ExchangeDeclare(exchange: "topic_logs",
                                        type: "topic");
                var regions = new string[3] { "USA", "Europe", "Asia" };
                var random = new Random((int)new TimeSpan().Ticks);

                for (int i = 0; i < 10; i++)
                {
                    var routingKey = "email." + regions[random.Next(3)];
                    var message = $"Hello World! to {routingKey}";
                    var body = Encoding.UTF8.GetBytes(message);
                    channel.BasicPublish(exchange: "topic_logs",
                                         routingKey: routingKey,
                                         basicProperties: null,
                                         body: body);

                    Console.WriteLine("Sent '{0}':'{1}'", routingKey, message);
                }
            }
        }
    }
}
