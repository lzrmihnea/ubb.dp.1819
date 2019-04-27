package popa.catalin.lab3.observer;

public interface CustomSubject {
    void attachObserver(CustomObserver observer);
    void notifyAllObservers(String message);
}
