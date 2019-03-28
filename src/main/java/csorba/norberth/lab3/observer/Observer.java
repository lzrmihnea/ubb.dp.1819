package csorba.norberth.lab3.observer;

public interface Observer<TArgs> {
    void update(TArgs args);
}
