package io.heartpattern.helloworld.command;

import io.heartpattern.helloworld.decorator.MessageDecorator;
import io.heartpattern.helloworld.observer.HelloSubject;

public class Greeter {
    private final HelloSubject subject;
    private final MessageDecorator decorator;
    private Command command;

    public Greeter(HelloSubject subject, MessageDecorator decorator) {
        this.subject = subject;
        this.decorator = decorator;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void greet() {
        command.execute(subject, decorator);
    }
}
