using LeaveDays.State;
using System;

namespace LeaveDays.ChainOfResponsability
{
    [Serializable]
    public abstract class Approver:Employee
    {
        private Approver _NextApprover;

        public abstract bool Approve(LeaveDay leaveDay);

        public Approver GetNextApprover()
        {
            return _NextApprover;
        }

        public void SetNextApprover(Approver approver)
        {
            _NextApprover = approver;
        }
    }
}
