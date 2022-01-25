package io.heartpattern.helloworld.observer;

import io.heartpattern.helloworld.Utils;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FilePrintObserver implements Observer<HelloSubject> {
    private BufferedWriter writer;

    public FilePrintObserver() {
        try {
            writer = new BufferedWriter(new FileWriter("output.txt"));
        } catch (Exception e) {
            Utils.sneakyThrow(e);
        }
    }

    @Override
    public void update(HelloSubject subject) {
        try {
            writer.write(subject.getMessage());
            writer.write("\n");
            writer.flush();
        } catch (Exception e) {
            Utils.sneakyThrow(e);
        }
    }
}
