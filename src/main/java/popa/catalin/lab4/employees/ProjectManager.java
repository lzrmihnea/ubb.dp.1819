package popa.catalin.lab4.employees;

import popa.catalin.lab4.state.Days;
import popa.catalin.lab4.strategy.NotificationType;

public class ProjectManager extends AbstractEmployee {
    @Override
    public double payPerDay() {
        return 150;
    }

    @Override
    public NotificationType notificationMechanism() {
        return NotificationType.PushNotification;
    }

    @Override
    public boolean approveHolidayRequest() {
        if (!(currentBillableDay().equals(Days.Working) || currentBillableDay().equals(Days.HomeOffice)))
        {
            System.out.println("Project manager could not approve the request, passing on to the next in the chain...");
            return nextApprover().approveHolidayRequest();
        }
        else
        {
            System.out.println("Project manager approved the request.");
            return true;
        }
    }
}
