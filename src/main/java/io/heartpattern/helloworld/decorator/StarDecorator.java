package io.heartpattern.helloworld.decorator;

public class StarDecorator implements MessageDecorator {
    private final MessageDecorator decorator;

    public StarDecorator(MessageDecorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public String decorate(String message) {
        return "★" + decorator.decorate(message) + "★";
    }
}
