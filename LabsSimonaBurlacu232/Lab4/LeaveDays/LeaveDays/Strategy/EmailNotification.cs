using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LeaveDays.Strategy
{
    [Serializable]
    public class EmailNotification:INotificationStrategy
    {
        public void SendMessage(Employee employee, string message)
        {
            Console.WriteLine($"Employee {employee.Name} was notified through email with message {message}");
        }
    }
}
