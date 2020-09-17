package ru.x5.homework5.task1.logger;

public class DbLogger implements Logger {
    public void log(String message) {
        System.out.println("Log into database: " + message);


    }
}
