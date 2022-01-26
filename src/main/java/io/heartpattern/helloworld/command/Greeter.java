package io.heartpattern.helloworld.command;

import io.heartpattern.helloworld.decorator.MessageDecorator;
import io.heartpattern.helloworld.facade.TalkFacade;
import io.heartpattern.helloworld.observer.HelloSubject;

public class Greeter {
    private final TalkFacade facade;
    private Command command;

    public Greeter(TalkFacade facade) {
        this.facade = facade;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void greet() {
        command.execute(facade);
    }
}
