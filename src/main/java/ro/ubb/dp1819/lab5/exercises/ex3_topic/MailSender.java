package ro.ubb.dp1819.lab5.exercises.ex3_topic;

public class MailSender {

    public static void main(String[] args) {
        TopicMailService topicMailService = new TopicMailService();
        for (int i = 0; i < 1000; i++) {
            topicMailService.sendMail("Hello World " + i, getRandomTopic());
        }
    }

    private enum RegionType {
        usa, eu
    }

    public static String getRandomTopic() {
        return Math.random() < 0.5D ? RegionType.eu.name() : RegionType.usa.name();
    }
}
