package io.heartpattern.helloworld.facade;

import io.heartpattern.helloworld.decorator.MessageDecorator;
import io.heartpattern.helloworld.observer.HelloSubject;

public class TalkFacade {
    private final HelloSubject subject;
    private final MessageDecorator decorator;

    public TalkFacade(HelloSubject subject, MessageDecorator decorator) {
        this.subject = subject;
        this.decorator = decorator;
    }

    public void talk(String message) {
        subject.setMessage(decorator.decorate(message));
    }
}
