package popa.catalin.lab3.observer;

import java.util.concurrent.atomic.AtomicInteger;

public class KillCounterObserver implements Observer {
    private AtomicInteger counter = new AtomicInteger(0); //thread safe, because i'm bored

    @Override
    public void update() {
        counter.incrementAndGet();
    }

    public Integer getValue() {
        return counter.get();
    }
}
