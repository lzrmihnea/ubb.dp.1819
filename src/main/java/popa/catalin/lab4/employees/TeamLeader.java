package popa.catalin.lab4.employees;

import popa.catalin.lab4.strategy.NotificationType;

public class TeamLeader extends AbstractEmployee{
    @Override
    public double payPerDay() {
        return 133;
    }

    @Override
    public NotificationType notificationMechanism() {
        return NotificationType.PushNotification;
    }
}
