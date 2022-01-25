package io.heartpattern.helloworld;

import io.heartpattern.helloworld.decorator.HeartDecorator;
import io.heartpattern.helloworld.decorator.NoopDecorator;
import io.heartpattern.helloworld.decorator.StarDecorator;
import io.heartpattern.helloworld.observer.ConsolePrintObserver;
import io.heartpattern.helloworld.observer.FilePrintObserver;
import io.heartpattern.helloworld.observer.HelloSubject;

public class HelloWorld {
    public static void main(String[] args) {
        var subject = new HelloSubject();
        subject.attach(new ConsolePrintObserver());
        subject.attach(new FilePrintObserver());

        var decorator = new HeartDecorator(
                new StarDecorator(
                        new NoopDecorator()
                )
        );

        subject.setMessage(decorator.decorate("Hello world!"));
    }
}
