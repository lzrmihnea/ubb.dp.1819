using LeaveDays.ChainOfResponsability;
using LeaveDays.State;
using LeaveDays.Strategy;
using System;
using System.Collections.Generic;

namespace LeaveDays
{
    [Serializable]
    public abstract class Employee
    {
        public DayStatus CurrentStatus { get; set; }
        public List<LeaveDay> History { get; set; }
        public Approver Approver { get; set; }
        public string Name { get; set; }
        public INotificationStrategy NotificationStrategy { get; set; }

        public abstract void MakeLeaveDayRequest(DayStatus dayStatus);

        public void ChangeStatus(DayStatus dayStatus)
        {
            CurrentStatus = dayStatus;
        }

    }
}
