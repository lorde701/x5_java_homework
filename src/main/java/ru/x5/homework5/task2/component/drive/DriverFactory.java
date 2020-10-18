package ru.x5.homework5.task2.component.drive;

import ru.x5.homework5.task2.CustomIllegalArgumentException;
import ru.x5.homework5.task2.component.ComponentType;

public class DriverFactory {

    public Drive getMemory(ComponentType type) {
        switch (type) {
            case BASED:
                return new Drive("WD", 102400, DriveType.HDD, DriveFormFactor.T3_5);
            case IMPROVED:
                return new Drive("WD", 1_024_000, DriveType.SSD, DriveFormFactor.T2_5);
        }
        throw new CustomIllegalArgumentException("Не выбран тип диска");
    }
}
