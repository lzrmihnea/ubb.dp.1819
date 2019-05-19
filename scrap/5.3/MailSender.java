package popa.catalin.lab5.ex3;

public class MailSender {

    public static void main(String[] args) {
        TopicMailService topicMailService = new TopicMailService();
        for (int i = 0; i < 1000; i++) {
            topicMailService.sendMail("Hello World " + i, getRandomTopic());
        }
    }

    public enum RegionType {
        usa, eu
    }

    public static String getRandomTopic() {
        return Math.random() < 0.5D ? RegionType.eu.name() : RegionType.usa.name();
    }
}
