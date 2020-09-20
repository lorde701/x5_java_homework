package ru.x5.homework5.task2.computer;

import ru.x5.homework5.task2.component.*;
import ru.x5.homework5.task2.component.drive.Drive;
import ru.x5.homework5.task2.component.drive.DriveFormFactor;
import ru.x5.homework5.task2.component.drive.DriveType;
import ru.x5.homework5.task2.component.memory.Memory;
import ru.x5.homework5.task2.component.memory.MemoryType;
import ru.x5.homework5.task2.component.videocard.CoolingType;
import ru.x5.homework5.task2.component.videocard.VideoCard;
import ru.x5.homework5.task2.component.videocard.VideoCardType;
import ru.x5.homework5.task2.computer.Computer;

public class OfficeComputer extends Computer {
    public OfficeComputer() {
        super(new Processor("Pentium 4", 1800, 2, 2, "Intel"),
                new Memory("Kingston", 2048, 1000, MemoryType.DDR3),
                new VideoCard("Palit", VideoCardType.GDDR4, 500, CoolingType.PASSIVE),
                new Drive("WD", 102400, DriveType.HDD, DriveFormFactor.T3_5),
                new Monitor("Acer"));
    }
}
