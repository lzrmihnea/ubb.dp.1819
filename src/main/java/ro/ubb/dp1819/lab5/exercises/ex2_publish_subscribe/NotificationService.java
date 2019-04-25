package ro.ubb.dp1819.lab5.exercises.ex2_publish_subscribe;

public class NotificationService {

    public void sendMail(String msg) {
        System.out.printf("Sending email {%s} \n", msg);
        System.out.println("Email sent.");
    }
}
