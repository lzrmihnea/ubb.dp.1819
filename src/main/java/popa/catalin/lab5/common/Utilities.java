package popa.catalin.lab5.common;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Utilities {
    public static void closeConnectionAndChannel(Connection connection, Channel channel) {
        if(connection != null && channel!=null)
        {
            try
            {
                channel.close();
                connection.close();
            }
            catch (TimeoutException | IOException e) {
                throw new RuntimeException("Error closing channel or connection !!");
            }
        }
    }

    public static Integer secondsElapsed(Long startTime, Long endTime) {
        return Math.round((endTime - startTime) / 1000F);
    }
}
