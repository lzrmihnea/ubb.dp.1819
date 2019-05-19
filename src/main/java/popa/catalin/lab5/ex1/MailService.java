package popa.catalin.lab5.ex1;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MailService {
    private static final String TASK_QUEUE_NAME = "task_queue";
    private ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    public void sendMail(String msg) throws Exception {
        Runnable command = () -> {
            try {
                enqueueMail(msg);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
        executorService.execute(command);
    }

    public void shutdown()
    {
        executorService.shutdown();
    }

    private void enqueueMail(String msg) throws Exception {
        System.out.printf("Sending email {%s} \n", msg);

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(TASK_QUEUE_NAME, true, false, false, null);

        channel.basicPublish("", TASK_QUEUE_NAME,
                MessageProperties.PERSISTENT_TEXT_PLAIN,
                msg.getBytes("UTF-8"));
        System.out.println(" [x] Sent '" + msg + "'");

        channel.close();
        connection.close();

        Thread.sleep(1000);
        System.out.println("Email sent.");
    }
}
