package io.heartpattern.helloworld.command;

import io.heartpattern.helloworld.facade.TalkFacade;

public class ByeWorldCommand implements Command {
    public void execute(TalkFacade facade) {
        facade.talk("Bye world!");
    }
}
