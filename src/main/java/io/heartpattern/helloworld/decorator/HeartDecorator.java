package io.heartpattern.helloworld.decorator;

public class HeartDecorator implements MessageDecorator {
    private final MessageDecorator decorator;

    public HeartDecorator(MessageDecorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public String decorate(String message) {
        return "♥" + decorator.decorate(message) + "♥";
    }
}
