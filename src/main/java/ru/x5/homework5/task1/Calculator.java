package ru.x5.homework5.task1;

import ru.x5.homework5.task1.logger.Logger;

public class Calculator {
    private Logger logger;

    public Calculator(Logger logger) {
        this.logger = logger;
    }

    public Integer add(Integer a, Integer b) {
        Integer result = a + b;
        logger.log(String.format("%s + %s = %s", a, b, result));
        return result;
    }

    public Integer deduct(Integer a, Integer b) {
        Integer result = a - b;
        logger.log(String.format("%s + %s = %s", a, b, result));
        return result;
    }

    public Integer multiply(Integer a, Integer b) {
        Integer result = a * b;
        logger.log(String.format("%s + %s = %s", a, b, result));
        return result;
    }

    public Integer divide(Integer a, Integer b) {
        try {
            Integer result = a / b;
            logger.log(String.format("%s + %s = %s", a, b, result));
            return result;
        } catch (ArithmeticException e) {
            logger.log(String.format("Не удалось разделить число %s на %s", a, b));
            return null;
        }
    }
}
