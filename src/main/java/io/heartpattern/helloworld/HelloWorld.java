package io.heartpattern.helloworld;

import io.heartpattern.helloworld.decorator.HeartDecorator;
import io.heartpattern.helloworld.decorator.NoopDecorator;
import io.heartpattern.helloworld.decorator.StarDecorator;
import io.heartpattern.helloworld.factory.ObserverFactory;
import io.heartpattern.helloworld.factory.ObserverType;
import io.heartpattern.helloworld.observer.HelloSubject;

public class HelloWorld {
    public static void main(String[] args) {
        var subject = new HelloSubject();
        subject.attach(ObserverFactory.createObserver(ObserverType.CONSOLE));
        subject.attach(ObserverFactory.createObserver(ObserverType.FILE));

        var decorator = new HeartDecorator(
                new StarDecorator(
                        new NoopDecorator()
                )
        );

        subject.setMessage(decorator.decorate("Hello world!"));
    }
}
