package io.heartpattern.helloworld.decorator;

public class NoopDecorator implements MessageDecorator {
    @Override
    public String decorate(String message) {
        return message;
    }
}
