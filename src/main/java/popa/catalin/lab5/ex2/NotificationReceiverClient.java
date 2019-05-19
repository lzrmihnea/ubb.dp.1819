package popa.catalin.lab5.ex2;

import popa.catalin.lab5.common.EmptyQueueException;

public class NotificationReceiverClient {
    public static void main(String[] args) {
        NotificationReceiver notificationReceiver = new NotificationReceiverImpl();
        for (int i = 1; i <= 100; ) {
            try {
                String message = notificationReceiver.receiveMessage();
                System.out.println(message);
                i++;
            } catch (EmptyQueueException ignored) {
            }
        }
        notificationReceiver.stopReceiver();
    }
}
