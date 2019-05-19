package popa.catalin.lab5.ex3;

import com.rabbitmq.client.*;
import popa.catalin.lab5.ex1.EmptyQueueException;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class EUMailReceiver implements RegionalMailReceiver {
    private static final String EXCHANGE_NAME = "THE_WORLD";

    @Override
    public String receiveMessage() {
        Channel channel = null;
        Connection connection = null;

        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("localhost");
            connection = factory.newConnection();
            channel = connection.createChannel();

            channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.TOPIC);
            String queueName = channel.queueDeclare().getQueue();

            channel.queueBind(queueName, EXCHANGE_NAME, MailSender.RegionType.eu.toString());

            GetResponse response = channel.basicGet(EXCHANGE_NAME, true);
            String message;
            if (response != null) {
                message = new String(response.getBody(), "UTF-8");
            } else
                throw new RuntimeException("Nothing to recieve!!");
            return message;
        } catch (TimeoutException | IOException e) {
            throw new EmptyQueueException("Nuthin' to get, boss!");
        } finally {
            if (channel != null) {
                try {
                    channel.close();
                } catch (TimeoutException | IOException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
