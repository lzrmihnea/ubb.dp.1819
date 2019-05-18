using System;

namespace LeaveDays.Strategy
{
    public interface INotificationStrategy
    {
        void SendMessage(Employee employee, String message);
    }
}
