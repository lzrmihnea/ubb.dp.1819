package csorba.norberth.lab3.observer;

public class PrintObserver implements Observer<Void> {
    @Override
    public void update(Void args) {
        System.out.println("update");
    }
}
