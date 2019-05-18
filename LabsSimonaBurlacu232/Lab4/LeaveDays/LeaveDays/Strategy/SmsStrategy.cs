using System;

namespace LeaveDays.Strategy
{

    [Serializable]
    public class SmsStrategy : INotificationStrategy
    {
        public void SendMessage(Employee employee, string message)
        {
            Console.WriteLine($"Employee {employee.Name} was notified through SMS with message {message}");
        }
    }
}
