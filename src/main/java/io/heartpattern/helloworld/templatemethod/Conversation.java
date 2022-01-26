package io.heartpattern.helloworld.templatemethod;

import io.heartpattern.helloworld.command.Greeter;
import io.heartpattern.helloworld.facade.TalkFacade;

public abstract class Conversation {
    private final Greeter greeter;
    protected final TalkFacade facade;

    public Conversation(Greeter greeter, TalkFacade facade) {
        this.greeter = greeter;
        this.facade = facade;
    }

    abstract void beforeConversation();

    protected abstract void afterConversation();

    protected void conversation() {
        greeter.greet();
    }

    public void talk() {
        beforeConversation();
        conversation();
        afterConversation();
    }
}
