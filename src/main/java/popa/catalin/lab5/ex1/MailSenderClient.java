package popa.catalin.lab5.ex1;

public class MailSenderClient {

    public static void main(String[] args) throws Exception {
        MailService mailService = new MailService();
        for (int i = 1; i <= 99; i++) {
            mailService.sendMail("Hello World " + i);
        }
        mailService.shutdown();
    }
}
