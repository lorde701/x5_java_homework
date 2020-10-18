package ru.x5.homework5.task2.component.memory;

import ru.x5.homework5.task2.CustomIllegalArgumentException;
import ru.x5.homework5.task2.component.ComponentType;

public class MemoryFactory {

    public Memory getMemory(ComponentType type) {
        switch (type) {
            case BASED:
                return new Memory("Kingston", 2048, 1000, MemoryType.DDR3);
            case IMPROVED:
                return new Memory("Kingston", 16384, 3500, MemoryType.DDR4);
        }
        throw new CustomIllegalArgumentException("Не выбран тип памяти");
    }
}
