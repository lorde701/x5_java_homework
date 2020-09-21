package ru.x5.homework5.task1.logger;

import ru.x5.homework5.task1.logger.ConsoleLogger;
import ru.x5.homework5.task1.logger.Logger;
import ru.x5.homework5.task1.logger.LoggerFactory;

public class ConsoleLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
