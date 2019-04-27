package popa.catalin.lab3.observer;

public interface Subject {
    void attachObserver(Observer observer);
    void notifyAllObservers();
}
