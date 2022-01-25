package io.heartpattern.helloworld.observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HelloSubject implements Subject<HelloSubject> {
    private final List<Observer<HelloSubject>> observers = new LinkedList<>();
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }

    @Override
    public void attach(Observer<HelloSubject> observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer<HelloSubject> observer) {
        observers.removeIf((obs) -> obs.equals(observer));
    }

    @Override
    public void notifyObservers() {
        var exceptions = new ArrayList<Exception>();
        observers.forEach((observer) -> {
            try {
                observer.update(this);
            } catch (Exception e) {
                exceptions.add(e);
            }
        });

        if (!exceptions.isEmpty())
            throw new AggregatedException(exceptions);
    }
}
