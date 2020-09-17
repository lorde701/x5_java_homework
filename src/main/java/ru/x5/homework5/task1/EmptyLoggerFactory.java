package ru.x5.homework5.task1;

import ru.x5.homework5.task1.logger.EmptyLogger;
import ru.x5.homework5.task1.logger.Logger;

public class EmptyLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        return new EmptyLogger();
    }
}
