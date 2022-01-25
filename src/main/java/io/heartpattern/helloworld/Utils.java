package io.heartpattern.helloworld;

public class Utils {
    public static <T extends Throwable> void sneakyThrow(Throwable throwable) throws T {
        //noinspection unchecked
        throw (T) throwable;
    }
}
