package ru.x5.homework5.task1.logger;

import ru.x5.homework5.task1.logger.FileLogger;
import ru.x5.homework5.task1.logger.Logger;
import ru.x5.homework5.task1.logger.LoggerFactory;

public class FileLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        return new FileLogger();
    }
}
