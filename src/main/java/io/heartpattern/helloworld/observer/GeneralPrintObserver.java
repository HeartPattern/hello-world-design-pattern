package io.heartpattern.helloworld.observer;

import io.heartpattern.helloworld.adapter.PrintAdapter;

public class GeneralPrintObserver implements Observer<HelloSubject> {
    private final PrintAdapter adapter;

    public GeneralPrintObserver(PrintAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void update(HelloSubject subject) {
        adapter.print(subject.getMessage());
    }
}
