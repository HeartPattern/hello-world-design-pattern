package io.heartpattern.helloworld.observer;

public class ConsolePrintObserver implements Observer<HelloSubject> {
    @Override
    public void update(HelloSubject subject) {
        System.out.println(subject.getMessage());
    }
}
