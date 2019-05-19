package popa.catalin.lab5.ex2;

import com.rabbitmq.client.*;
import popa.catalin.lab5.common.EmptyQueueException;
import popa.catalin.lab5.common.Utilities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NotificationReceiverImpl implements NotificationReceiver {
    private static final String EXCHANGE_NAME = "logs";
    private Connection connection;
    private Channel channel;
    private List<String> messageQueue = new ArrayList<>();
    private final Lock mutex = new ReentrantLock(true);

    public NotificationReceiverImpl() {
        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("localhost");
            connection = factory.newConnection();
            channel = connection.createChannel();

            channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.FANOUT);
            String queueName = channel.queueDeclare().getQueue();
            channel.queueBind(queueName, EXCHANGE_NAME, "");

            Consumer consumer = new DefaultConsumer(channel) {
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope,
                                           AMQP.BasicProperties properties, byte[] body) throws IOException {
                    String message = new String(body, "UTF-8");

                    mutex.lock(); // not the best possible implementation, but it's the best solution I have
                    // that doesen't 'steal' the messages from the queue, prevening other subscribers from
                    // receiving them ...
                    messageQueue.add(message);
                    mutex.unlock();
                }
            };
            channel.basicConsume(queueName, true, consumer);
        } catch (TimeoutException | IOException e) {
            throw new RuntimeException("Couldn't start receiving !!");
        }
    }

    @Override
    public String receiveMessage() {
        mutex.lock();
        if (messageQueue.size() > 0) {
            String message = messageQueue.get(0);
            messageQueue.remove(0);

            mutex.unlock();
            return message;
        } else {
            mutex.unlock();
            throw new EmptyQueueException("Nothing to receive!!");
        }

    }

    @Override
    public void stopReceiver() {
        Utilities.closeConnectionAndChannel(connection, channel);
    }
}
