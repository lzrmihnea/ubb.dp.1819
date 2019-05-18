using LeaveDays.ChainOfResponsability;
using LeaveDays.State;
using System;
using System.Collections.Generic;

namespace LeaveDays
{
    [Serializable]
    public class Developer:Employee
    {
        public Developer(string name)
        {
            Name = name;
            History = new List<LeaveDay>();
            CurrentStatus = DayStatus.Working;
        }

        public override void MakeLeaveDayRequest(DayStatus dayStatus)
        {
            var leaveDay = new LeaveDay(dayStatus, this);
            History.Add(leaveDay.DeepClone());
            Approver.Approve(leaveDay);
        }
    }
}
