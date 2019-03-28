package csorba.norberth.lab3.observer;

public class InvalidMoveObserver implements Observer<Void> {
    @Override
    public void update(Void aVoid) {
        System.out.println("invalid move");
    }
}
