package popa.catalin.lab3.observer;

import java.util.ArrayList;
import java.util.List;

public class CustomSubjectImpl implements CustomSubject {
    private List<CustomObserver> observers = new ArrayList<>();

    @Override
    public void attachObserver(CustomObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyAllObservers(String message) {
        for (CustomObserver o : observers)
            o.recieveMessage(message);
    }
}
