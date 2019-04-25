package ro.ubb.dp1819.lab5.exercises.ex1_producer_consumer;

public class MailSenderClient {

    public static void main(String[] args) throws InterruptedException {
        MailService mailService = new MailService();
        for (int i = 0; i < 1000; i++) {
            mailService.sendMail("Hello World " + i);
        }
    }
}
