package popa.catalin.lab5.ex2;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeoutException;

public class NotificationService {
    private static final String EXCHANGE_NAME = "logs";

    public void sendMail(String msg) {
        System.out.printf("Sending email {%s} \n", msg);

        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("localhost");
            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();

            channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.FANOUT);

            channel.basicPublish(EXCHANGE_NAME, "", null, msg.getBytes("UTF-8"));
            System.out.println(" [x] Sent '" + msg + "'");

            channel.close();
            connection.close();
        } catch (IOException | TimeoutException e) {
            throw new RuntimeException("Can't send message: " + e.getMessage());
        }

        System.out.println("Email sent.");
    }
}
