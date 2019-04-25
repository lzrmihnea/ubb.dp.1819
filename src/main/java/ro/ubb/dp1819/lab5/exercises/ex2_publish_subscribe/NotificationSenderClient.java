package ro.ubb.dp1819.lab5.exercises.ex2_publish_subscribe;

public class NotificationSenderClient {

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        for (int i = 0; i < 1000; i++) {
            notificationService.sendMail("Hello World " + i);
        }
    }
}
