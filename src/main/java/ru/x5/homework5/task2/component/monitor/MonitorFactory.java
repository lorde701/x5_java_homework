package ru.x5.homework5.task2.component.monitor;

import ru.x5.homework5.task2.CustomIllegalArgumentException;
import ru.x5.homework5.task2.component.ComponentType;

public class MonitorFactory {

    public Monitor getMemory(ComponentType type) {
        switch (type) {
            case BASED:
                return new Monitor("Dell");
            case IMPROVED:
                return new Monitor("Acer");
        }
        throw new CustomIllegalArgumentException("Не выбран тип монитора");
    }
}
