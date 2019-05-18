using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using RabbitMQ.Client;

namespace EmailSender
{
    public class MailService
    {
        public void SendMail(string message, IModel channel)
        {
            Console.WriteLine($"Sending email {message}");
            var body = Encoding.UTF8.GetBytes(message);
           
        }
    }
}
