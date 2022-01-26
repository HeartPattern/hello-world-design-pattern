package io.heartpattern.helloworld.adapter;

import io.heartpattern.helloworld.Utils;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FilePrintAdapter implements PrintAdapter {
    private BufferedWriter writer;

    public FilePrintAdapter() {
        try {
            writer = new BufferedWriter(new FileWriter("output.txt"));
        } catch (Exception e) {
            Utils.sneakyThrow(e);
        }
    }

    @Override
    public void print(String message) {
        try {
            writer.write(message);
            writer.newLine();
            writer.flush();
        } catch (Exception e) {
            Utils.sneakyThrow(e);
        }
    }
}
