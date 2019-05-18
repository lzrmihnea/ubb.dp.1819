using LeaveDays.ChainOfResponsability;
using LeaveDays.State;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace LeaveDays
{
    [Serializable]
    public class ProjectManager : Approver
    {

        public ProjectManager(string name)
        {
            Name = name;
            History = new List<LeaveDay>();
            CurrentStatus = DayStatus.Working;
        }

        public override bool Approve(LeaveDay leaveDay)
        {
            if(CurrentStatus != DayStatus.Working && CurrentStatus != DayStatus.HomeOffice)
            {
                return GetNextApprover().Approve(leaveDay);
            }

            var random = new Random().NextDouble();
            var approved = true;
            if(random<0.5)
            {
                leaveDay.Status = LeaveDayStatus.APPROVED;
               
            }
            else
            {
                leaveDay.Status = LeaveDayStatus.REJECTED;
                approved = false;
            }

            Thread.Sleep(3000);
            leaveDay.Employee.ChangeStatus(leaveDay.DayStatus);
            leaveDay.Approver = this;
            leaveDay.RequestDate = DateTime.Now;
            leaveDay.Employee.History.Add(leaveDay.DeepClone());

            var notificationStrategy = leaveDay.Employee.NotificationStrategy;
            if (notificationStrategy != null)
                notificationStrategy.SendMessage(leaveDay.Employee, "Your leave day request was modified");

            return approved;
        }

        public override void MakeLeaveDayRequest(DayStatus dayStatus)
        {
            var leaveDay = new LeaveDay(dayStatus, this);
            leaveDay.Status = LeaveDayStatus.APPROVED;
            History.Add(leaveDay);
            CurrentStatus = dayStatus;
        }
    }
}
