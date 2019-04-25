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
            return nextApprover().approveHolidayRequest();
        else
            return true;
    }
}
