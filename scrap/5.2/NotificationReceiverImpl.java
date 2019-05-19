package popa.catalin.lab5.ex2;

import com.rabbitmq.client.*;
import popa.catalin.lab5.common.Utilities;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeoutException;

public class NotificationReceiverImpl implements NotificationReceiver {
    private static final String EXCHANGE_NAME = "logs";

    @Override
    public String receiveMessage() // this particular implementation will block until a message is received
    // however, it has the same old bug: it 'steals' messages from others :(
    {
        Connection connection = null;
        Channel channel = null;

        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("localhost");
            connection = factory.newConnection();
            channel = connection.createChannel();

            channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.FANOUT);
            String queueName = channel.queueDeclare().getQueue();
            channel.queueBind(queueName, EXCHANGE_NAME, "");

            System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

            GetResponse response = null;
            while (response == null) {
                response = channel.basicGet(queueName, true);
            }
            return new String(response.getBody(), "UTF-8");
        } catch (IOException | TimeoutException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            Utilities.closeConnectionAndChannel(connection, channel);
        }
    }
}
