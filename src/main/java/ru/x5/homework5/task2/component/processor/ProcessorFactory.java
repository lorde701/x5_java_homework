package ru.x5.homework5.task2.component.processor;

import ru.x5.homework5.task2.CustomIllegalArgumentException;
import ru.x5.homework5.task2.component.ComponentType;

public class ProcessorFactory {
    public Processor getMemory(ComponentType type) {
        switch (type) {
            case BASED:
                return new Processor("Pentium 4", 1800, 2, 2, "Intel");
            case IMPROVED:
                return new Processor("Core i7", 4500, 4, 20, "Intel");
        }
        throw new CustomIllegalArgumentException("Не выбран тип процессора");
    }
}
