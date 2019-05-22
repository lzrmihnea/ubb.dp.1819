using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace Worker
{
    class MailService
    {
        public void SendMail(String msg)
        {
            Console.WriteLine($"Sending email {msg} \n");
            Thread.Sleep(1000);
            Console.WriteLine("Email sent.");
        }
    }
}
