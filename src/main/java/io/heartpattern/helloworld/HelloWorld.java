package io.heartpattern.helloworld;

import io.heartpattern.helloworld.observer.ConsolePrintObserver;
import io.heartpattern.helloworld.observer.FilePrintObserver;
import io.heartpattern.helloworld.observer.HelloSubject;

public class HelloWorld {
    public static void main(String[] args) {
        var subject = new HelloSubject();
        subject.attach(new ConsolePrintObserver());
        subject.attach(new FilePrintObserver());

        subject.setMessage("Hello world!");
    }
}
