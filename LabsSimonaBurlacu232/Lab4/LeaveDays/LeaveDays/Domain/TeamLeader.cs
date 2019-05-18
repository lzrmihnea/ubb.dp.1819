using LeaveDays.ChainOfResponsability;
using LeaveDays.State;
using System;
using System.Collections.Generic;
using System.Threading;

namespace LeaveDays
{
    [Serializable]
    public class TeamLeader :  Approver
    {
        public TeamLeader(string name)
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

        public override bool Approve(LeaveDay leaveDay)
        {
            var random = new Random().NextDouble();
            var approved = true;
            if (leaveDay.Employee == this)
            {
                approved = false;
                return approved;
            }

            if (CurrentStatus != DayStatus.Working && CurrentStatus != DayStatus.HomeOffice)
            {
                leaveDay.Status = LeaveDayStatus.PENDING;
                approved = false;
            }
            else
            {
                if (random < 0.5)
                {
                    leaveDay.Status = LeaveDayStatus.APPROVED;
                }
                else
                {
                    leaveDay.Status = LeaveDayStatus.REJECTED;
                    approved = false;
                }

            }

            Thread.Sleep(3000);
            leaveDay.Employee.ChangeStatus(leaveDay.DayStatus);
            leaveDay.Approver = this;
            leaveDay.RequestDate = DateTime.Now;
            leaveDay.Employee.History.Add(leaveDay);

            var notificationStrategy = leaveDay.Employee.NotificationStrategy;
            if (notificationStrategy != null)
                notificationStrategy.SendMessage(leaveDay.Employee, "Your leave day request was modified");
            
            return approved;
        }
    }
}
