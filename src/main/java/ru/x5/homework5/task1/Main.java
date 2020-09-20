package ru.x5.homework5.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите способ логирования: CONSOLE - консоль, DB - база данных, FILE - файл");
        Scanner sc = new Scanner(System.in);
        LoggerType loggerType = null;
        try {
            loggerType = LoggerType.valueOf(sc.next());
        } catch (IllegalArgumentException ignore) {
            loggerType = LoggerType.EMPTY;
        }
        LoggerFactory loggerFactory = null;
        switch (loggerType) {
            case CONSOLE:
                loggerFactory = new ConsoleLoggerFactory();
                break;
            case DB:
                loggerFactory = new DbLoggerFactory();
                break;
            case FILE:
                loggerFactory = new FileLoggerFactory();
                break;
            case EMPTY:
                loggerFactory = new EmptyLoggerFactory();
                break;
        }

        Calculator calculator = new Calculator(loggerFactory.createLogger());
        System.out.println(calculator.add(20, 1));
        System.out.println(calculator.divide(20, 0));
        System.out.println(calculator.deduct(20, 7));
        System.out.println(calculator.multiply(20, 2));
    }
}
