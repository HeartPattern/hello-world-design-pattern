package io.heartpattern.helloworld.adapter;

public class ConsolePrintAdapter implements PrintAdapter{
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
