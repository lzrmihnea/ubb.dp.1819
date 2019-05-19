package popa.catalin.lab5.ex1;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.GetResponse;
import popa.catalin.lab5.common.EmptyQueueException;

import static popa.catalin.lab5.common.Utilities.closeConnectionAndChannel;

public class MailWorkerImpl implements MailWorker {
    private static final String TASK_QUEUE_NAME = "task_queue";

    @Override
    public String receiveMessage() // this implementation will throw an EmptyQueueException if we try to
            // receive a message that was not sent yet
    {
        Connection connection = null;
        Channel channel = null;
        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("localhost");
            connection = factory.newConnection();
            channel = connection.createChannel();

            channel.queueDeclare(TASK_QUEUE_NAME, true, false, false, null);

            channel.basicQos(1);

            GetResponse response = channel.basicGet(TASK_QUEUE_NAME, true);
            String message;
            if (response != null) {
                message = new String(response.getBody(), "UTF-8");
            } else
                throw new EmptyQueueException("Nothing to receive!!");
            return message;
        } catch (Exception e) {
            throw new RuntimeException("Problem receiving message : " + e.getMessage());
        }
        finally {
            closeConnectionAndChannel(connection, channel);
        }
    }
}
