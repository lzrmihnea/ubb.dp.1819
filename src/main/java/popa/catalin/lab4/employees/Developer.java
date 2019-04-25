package popa.catalin.lab4.employees;

import popa.catalin.lab4.strategy.NotificationType;

public class Developer extends AbstractEmployee{
    @Override
    public double payPerDay() {
        return 100;
    }

    @Override
    public NotificationType notificationMechanism() {
        return NotificationType.PushNotification;
    }
}
