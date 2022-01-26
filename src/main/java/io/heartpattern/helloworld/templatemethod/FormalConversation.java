package io.heartpattern.helloworld.templatemethod;

import io.heartpattern.helloworld.command.Greeter;
import io.heartpattern.helloworld.facade.TalkFacade;

public class FormalConversation extends Conversation {
    public FormalConversation(Greeter greeter, TalkFacade facade) {
        super(greeter, facade);
    }

    @Override
    protected void beforeConversation() {
        facade.talk("Dear world");
    }

    @Override
    protected void afterConversation() {
        facade.talk("Yours sincerely, greeter");
    }
}
