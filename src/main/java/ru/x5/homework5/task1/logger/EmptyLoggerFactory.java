package ru.x5.homework5.task1.logger;

import ru.x5.homework5.task1.logger.EmptyLogger;
import ru.x5.homework5.task1.logger.Logger;
import ru.x5.homework5.task1.logger.LoggerFactory;

public class EmptyLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        return new EmptyLogger();
    }
}
