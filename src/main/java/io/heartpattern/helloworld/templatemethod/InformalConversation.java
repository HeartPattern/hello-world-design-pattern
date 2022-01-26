package io.heartpattern.helloworld.templatemethod;

import io.heartpattern.helloworld.command.Greeter;
import io.heartpattern.helloworld.facade.TalkFacade;

public class InformalConversation extends Conversation{
    public InformalConversation(Greeter greeter, TalkFacade facade) {
        super(greeter, facade);
    }

    @Override
    protected void beforeConversation() {
        facade.talk("What's up?");
    }

    @Override
    protected void afterConversation() {
        facade.talk("See ya");
    }
}
