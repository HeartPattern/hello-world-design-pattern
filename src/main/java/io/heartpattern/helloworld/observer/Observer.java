package io.heartpattern.helloworld.observer;

public interface Observer<T extends Subject<T>> {
    void update(T subject);
}
