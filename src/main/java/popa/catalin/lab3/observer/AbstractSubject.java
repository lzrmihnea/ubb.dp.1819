package popa.catalin.lab3.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer o : observers)
            o.update();
    }
}
