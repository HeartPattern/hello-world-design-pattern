package io.heartpattern.helloworld.command;

import io.heartpattern.helloworld.decorator.MessageDecorator;
import io.heartpattern.helloworld.facade.TalkFacade;
import io.heartpattern.helloworld.observer.HelloSubject;

public class HelloWorldCommand implements Command {
    public void execute(TalkFacade facade) {
        facade.talk("Hello world!");
    }
}
