package io.heartpattern.helloworld.observer;

import java.util.Collection;

public class AggregatedException extends RuntimeException {

    public AggregatedException(Collection<Exception> exceptions) {
        super("Multiple exception thrown");
        exceptions.forEach(this::addSuppressed);
    }
}
