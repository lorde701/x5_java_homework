package ru.x5.homework5.task2.computer;

import ru.x5.homework5.task2.component.ComponentType;
import ru.x5.homework5.task2.component.drive.DriverFactory;
import ru.x5.homework5.task2.component.memory.MemoryFactory;
import ru.x5.homework5.task2.component.monitor.MonitorFactory;
import ru.x5.homework5.task2.component.processor.ProcessorFactory;
import ru.x5.homework5.task2.component.videocard.VideoCardFactory;

public class CheapGamingComputerStrategy implements ComputerStrategy {
    @Override
    public Computer createComputer() {
        Computer computer = new Computer();
        computer.addComponent(new ProcessorFactory().getMemory(ComponentType.IMPROVED));
        computer.addComponent(new MemoryFactory().getMemory(ComponentType.IMPROVED));
        computer.addComponent(new VideoCardFactory().getVideoCard(ComponentType.IMPROVED));
        computer.addComponent(new DriverFactory().getMemory(ComponentType.IMPROVED));
        computer.addComponent(new MonitorFactory().getMemory(ComponentType.IMPROVED));
        return computer;
    }
}
