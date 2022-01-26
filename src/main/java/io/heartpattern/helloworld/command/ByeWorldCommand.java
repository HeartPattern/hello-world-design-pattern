package io.heartpattern.helloworld.command;

import io.heartpattern.helloworld.decorator.MessageDecorator;
import io.heartpattern.helloworld.observer.HelloSubject;

public class ByeWorldCommand implements Command {
    public void execute(HelloSubject subject, MessageDecorator decorator) {
        subject.setMessage(decorator.decorate("Bye world!"));
    }
}
