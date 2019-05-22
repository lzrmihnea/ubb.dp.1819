using RabbitMQ.Client;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DP_Lab5_Homework_2
{
    class Program
    {
        static void Main(string[] args)
        {
            var factory = new ConnectionFactory() { HostName = "localhost" };
            using (var connection = factory.CreateConnection())
            using (var channel = connection.CreateModel())
            {
                channel.ExchangeDeclare(exchange: "direct_logs",
                                        type: "direct");
                var random = new Random((int)new TimeSpan().Ticks);
                var types = new string[] { "SMS", "Email", "Push" };

                for (int i = 0; i < 10; i++)
                {

                    var notificationType = types[random.Next(3)];
                    var message = $"Hello World! Sent through {notificationType} Notifications";


                    var body = Encoding.UTF8.GetBytes(message);
                    channel.BasicPublish(exchange: "direct_logs",
                                         routingKey: notificationType,
                                         basicProperties: null,
                                         body: body);
                    Console.WriteLine($"Sent '{message}' through '{notificationType}'");

                }
            }

            Console.ReadLine();
        }
    }
}
