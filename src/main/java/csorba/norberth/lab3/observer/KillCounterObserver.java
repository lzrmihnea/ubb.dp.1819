package csorba.norberth.lab3.observer;

public class KillCounterObserver implements Observer<Void> {
    private int count;

    @Override
    public void update(Void args) {
        System.out.println(++count);
    }
}
