package ru.x5.homework5.task2.computer;

import ru.x5.homework5.task2.component.drive.Drive;
import ru.x5.homework5.task2.component.memory.Memory;
import ru.x5.homework5.task2.component.Monitor;
import ru.x5.homework5.task2.component.Processor;
import ru.x5.homework5.task2.component.videocard.VideoCard;
import ru.x5.homework5.task2.computer.Computer;

public class GamingComputer extends Computer {
    public GamingComputer(Processor processor, Memory memory, VideoCard videoCard, Drive drive, Monitor monitor) {
        super(processor, memory, videoCard, drive, monitor);
    }
}
