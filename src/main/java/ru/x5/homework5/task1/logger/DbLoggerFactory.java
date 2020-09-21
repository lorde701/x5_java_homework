package ru.x5.homework5.task1.logger;

import ru.x5.homework5.task1.logger.DbLogger;
import ru.x5.homework5.task1.logger.Logger;
import ru.x5.homework5.task1.logger.LoggerFactory;

public class DbLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        return new DbLogger();
    }
}
