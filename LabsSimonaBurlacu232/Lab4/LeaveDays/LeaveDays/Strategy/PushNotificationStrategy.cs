using System;

namespace LeaveDays.Strategy
{

    [Serializable]
    public class PushNotificationStrategy
    {
        public void SendMessage(Employee employee, string message)
        {
            Console.WriteLine($"Employee {employee.Name} was notified through Push Notification with message {message}");
        }
    }
}
