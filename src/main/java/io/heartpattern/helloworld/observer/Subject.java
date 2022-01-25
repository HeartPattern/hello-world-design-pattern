package io.heartpattern.helloworld.observer;

public interface Subject<T extends Subject<T>> {
    void attach(Observer<T> observer);
    void detach(Observer<T> observer);
    void notifyObservers();
}
