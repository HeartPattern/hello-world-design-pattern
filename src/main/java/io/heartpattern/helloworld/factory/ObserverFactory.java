package io.heartpattern.helloworld.factory;

import io.heartpattern.helloworld.observer.ConsolePrintObserver;
import io.heartpattern.helloworld.observer.FilePrintObserver;
import io.heartpattern.helloworld.observer.HelloSubject;
import io.heartpattern.helloworld.observer.Observer;

public class ObserverFactory {
    public static Observer<HelloSubject> createObserver(ObserverType type) {
        if (type == ObserverType.CONSOLE)
            return new ConsolePrintObserver();

        if (type == ObserverType.FILE)
            return new FilePrintObserver();

        throw new IllegalArgumentException("Unknown observer type: " + type);
    }
}
