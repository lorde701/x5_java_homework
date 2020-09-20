package ru.x5.homework5.task2.computer;

import ru.x5.homework5.task2.component.*;
import ru.x5.homework5.task2.component.drive.Drive;
import ru.x5.homework5.task2.component.memory.Memory;
import ru.x5.homework5.task2.component.videocard.VideoCard;

public class Computer {
    private Processor processor;
    private Memory memory;
    private VideoCard videoCard;
    private Drive drive;
    private Monitor monitor;

    public Computer(Processor processor, Memory memory, VideoCard videoCard, Drive drive, Monitor monitor) {
        this.processor = processor;
        this.memory = memory;
        this.videoCard = videoCard;
        this.drive = drive;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", memory=" + memory +
                ", videoCard=" + videoCard +
                ", drive=" + drive +
                ", monitor='" + monitor + '\'' +
                '}';
    }
}
