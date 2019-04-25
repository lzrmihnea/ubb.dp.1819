package ro.ubb.dp1819.lab5.exercises.ex1_producer_consumer;

public class MailService {

    public void sendMail(String msg) throws InterruptedException {
        System.out.printf("Sending email {%s} \n", msg);
        Thread.sleep(1000);
        System.out.println("Email sent.");
    }
}
