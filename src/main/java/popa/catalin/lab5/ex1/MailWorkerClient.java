package popa.catalin.lab5.ex1;

import popa.catalin.lab5.common.EmptyQueueException;

public class MailWorkerClient {
    public static void main(String[] args) // try starting 3 of these :)
    {
        MailWorker mailWorker = new MailWorkerImpl();
        for (int i = 1; i <= 33; ) {
            try {
                String message = mailWorker.receiveMessage();
                System.out.println(message);
                i++;
            } catch (EmptyQueueException ignored) {
            }
        }
    }
}
