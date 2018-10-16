package utils;

public class log {
    private static log ourInstance = new log();

    public static log getInstance() {
        return ourInstance;
    }

    private log() {
    }
}
