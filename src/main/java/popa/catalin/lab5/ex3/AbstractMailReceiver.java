package popa.catalin.lab5.ex3;

import com.rabbitmq.client.*;
import popa.catalin.lab5.common.EmptyQueueException;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import static popa.catalin.lab5.common.Utilities.closeConnectionAndChannel;

public abstract class AbstractMailReceiver implements RegionalMailReceiver {
    private static final String EXCHANGE_NAME = "topic_logs";

    @Override
    public String receiveMessage() {
        Connection connection = null;
        Channel channel = null;
        try
        {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("localhost");
            connection = factory.newConnection();
            channel = connection.createChannel();

            channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.TOPIC);
            String queueName = channel.queueDeclare().getQueue();

            channel.queueBind(queueName, EXCHANGE_NAME, this.getRegion());

            GetResponse response = channel.basicGet(queueName, true);
            String message;
            if (response != null) {
                message = new String(response.getBody(), "UTF-8");
            } else
                throw new EmptyQueueException("Nothing to receive!!");
            return message;
        } catch (TimeoutException | IOException e) {
            throw new RuntimeException("Problem receiving data: " + e.getMessage());
        }
        finally {
            closeConnectionAndChannel(connection, channel);
        }
    }
}
