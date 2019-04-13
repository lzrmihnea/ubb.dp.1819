package csorba.norberth.lab4.strategy;

public enum NotificationType {
    SMS(new SmsNotificationStrategy()),
    PUSH_NOTIFICATION(new PushNotificationStrategy()),
    EMAIL(new EmailNotificationStrategy());

    private NotificationStrategy strategy;

    NotificationType(NotificationStrategy strategy){
        this.strategy = strategy;
    }

    public NotificationStrategy getStrategy(){
        return this.strategy;
    }
}
