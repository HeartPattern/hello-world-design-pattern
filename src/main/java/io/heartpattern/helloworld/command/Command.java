package io.heartpattern.helloworld.command;

import io.heartpattern.helloworld.decorator.MessageDecorator;
import io.heartpattern.helloworld.facade.TalkFacade;
import io.heartpattern.helloworld.observer.HelloSubject;

public interface Command {
    void execute(TalkFacade facade);
}
