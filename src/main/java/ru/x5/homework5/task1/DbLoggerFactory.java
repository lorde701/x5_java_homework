package ru.x5.homework5.task1;

import ru.x5.homework5.task1.logger.DbLogger;
import ru.x5.homework5.task1.logger.Logger;

public class DbLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        return new DbLogger();
    }
}
