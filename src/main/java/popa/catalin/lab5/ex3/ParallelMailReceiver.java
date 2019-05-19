package popa.catalin.lab5.ex3;

import popa.catalin.lab5.common.EmptyQueueException;
import popa.catalin.lab5.common.Utilities;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelMailReceiver {
    private ExecutorService executorService = Executors.newFixedThreadPool(2); // EU and US

    public void addNewReceiver(RegionalMailReceiver receiver)
    {
        executorService.execute(()->
        {
            Long programStart = System.currentTimeMillis();
            Integer runFor = 30; // seconds ...
            Long now;
            Integer diff;
            String message;

            do { // we have no idea how many mails we're going to receive, so we're just listening for mails
                // for a finite, pre-defined number of times
                now = System.currentTimeMillis();
                diff = Utilities.secondsElapsed(programStart, now);
                try {
                    message = receiver.receiveMessage();
                    System.out.println(message+" for "+receiver.getRegion());
                } catch (EmptyQueueException ignored) {
                }
            }
            while (diff < runFor);
        });
    }

    public void stop()
    {
        executorService.shutdown();
    }
}
