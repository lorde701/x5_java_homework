package ru.x5.homework5.task2.computer;

import ru.x5.homework5.task2.component.*;
import ru.x5.homework5.task2.component.drive.Drive;
import ru.x5.homework5.task2.component.drive.DriveFormFactor;
import ru.x5.homework5.task2.component.drive.DriveType;
import ru.x5.homework5.task2.component.memory.Memory;
import ru.x5.homework5.task2.component.memory.MemoryType;
import ru.x5.homework5.task2.component.videocard.VideoCardStrategy;

public class GamingComputerFactory implements ComputerFactory {
    private VideoCardStrategy videoCardStrategy;

    public GamingComputerFactory(VideoCardStrategy videoCardStrategy) {
        this.videoCardStrategy = videoCardStrategy;
    }

    @Override
    public Computer createComputer() {
        return new GamingComputer(
                new Processor("Core i7", 4500, 4, 20, "Intel"),
                new Memory("Kingston", 16384, 3500, MemoryType.DDR4),
                videoCardStrategy.getVideoCard(),
                new Drive("WD", 1_024_000, DriveType.SSD, DriveFormFactor.T2_5),
                new Monitor("Dell"));
    }
}
