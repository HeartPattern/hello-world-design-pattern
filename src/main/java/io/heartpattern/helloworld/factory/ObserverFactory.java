package io.heartpattern.helloworld.factory;

import io.heartpattern.helloworld.adapter.ConsolePrintAdapter;
import io.heartpattern.helloworld.adapter.FilePrintAdapter;
import io.heartpattern.helloworld.observer.GeneralPrintObserver;
import io.heartpattern.helloworld.observer.HelloSubject;
import io.heartpattern.helloworld.observer.Observer;

public class ObserverFactory {
    public static Observer<HelloSubject> createObserver(ObserverType type) {
        if (type == ObserverType.CONSOLE)
            return new GeneralPrintObserver(new ConsolePrintAdapter());

        if (type == ObserverType.FILE)
            return new GeneralPrintObserver(new FilePrintAdapter());

        throw new IllegalArgumentException("Unknown observer type: " + type);
    }
}
