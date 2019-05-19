package popa.catalin.lab5.ex2;

public class NotificationSenderClient {

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        for (int i = 0; i < 100; i++) {
            notificationService.sendMail("Hello World " + i);
        }
    }
}
