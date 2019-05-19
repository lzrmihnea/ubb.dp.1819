package popa.catalin.lab5.ex2;

import com.rabbitmq.client.*;

public class OneMessageATime {
    private static final String EXCHANGE_NAME = "logs";

    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.FANOUT);
        String queueName = channel.queueDeclare().getQueue();
        channel.queueBind(queueName, EXCHANGE_NAME, "");

        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

        GetResponse response = null;
        while (response == null) {
            response = channel.basicGet(queueName, true);
        }
        String message = new String(response.getBody(), "UTF-8");
        System.out.println(message);

        channel.close();
        connection.close();
    }
}
