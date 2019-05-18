using System;
using System.Threading;

namespace EmailReceiver
{
    public class MailService
    {
        public void SendEmail(string message)
        {
            Console.WriteLine("Sending message " + message);
            Thread.Sleep(1000);
            Console.WriteLine("Email sent");
        }
    }
}
