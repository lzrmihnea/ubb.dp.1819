using LeaveDays.ChainOfResponsability;
using System;
using System.IO;
using System.Runtime.Serialization.Formatters.Binary;

namespace LeaveDays.State
{
    [Serializable]
    public class LeaveDay
    {
        public Employee Employee { get; set; }
        public DayStatus DayStatus { get; set; }
        public LeaveDayStatus Status { get; set; }
        public DateTime RequestDate { get; set; }
        public Approver Approver { get; set; }

        public LeaveDay(DayStatus dayStatus, Employee employee)
        {
            DayStatus = DayStatus;
            Employee = employee;
            RequestDate = DateTime.Now;
            Status = LeaveDayStatus.PENDING;
        }

        public LeaveDay DeepClone()
        {
            var obj = this;
            using (var ms = new MemoryStream())
            {
                var formatter = new BinaryFormatter();
                formatter.Serialize(ms, obj);
                ms.Position = 0;

                return (LeaveDay)formatter.Deserialize(ms);
            }
        }
    }
}
