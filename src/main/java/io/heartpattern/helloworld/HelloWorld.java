package io.heartpattern.helloworld;

import io.heartpattern.helloworld.command.Greeter;
import io.heartpattern.helloworld.command.HelloWorldCommand;
import io.heartpattern.helloworld.decorator.HeartDecorator;
import io.heartpattern.helloworld.decorator.NoopDecorator;
import io.heartpattern.helloworld.decorator.StarDecorator;
import io.heartpattern.helloworld.facade.TalkFacade;
import io.heartpattern.helloworld.factory.ObserverFactory;
import io.heartpattern.helloworld.factory.ObserverType;
import io.heartpattern.helloworld.observer.HelloSubject;
import io.heartpattern.helloworld.templatemethod.FormalConversation;

public class HelloWorld {
    public static void main(String[] args) {
        HelloSubject.getInstance().attach(ObserverFactory.createObserver(ObserverType.CONSOLE));
        HelloSubject.getInstance().attach(ObserverFactory.createObserver(ObserverType.FILE));

        var decorator = new HeartDecorator(
                new StarDecorator(
                        new NoopDecorator()
                )
        );

        var facade = new TalkFacade(HelloSubject.getInstance(), decorator);

        var greeter = new Greeter(facade);
        greeter.setCommand(new HelloWorldCommand());

        var conversation = new FormalConversation(greeter, facade);
        conversation.talk();
    }
}
