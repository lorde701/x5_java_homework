package ru.x5.homework5.task2.computer;

import ru.x5.homework5.task2.component.ComponentType;
import ru.x5.homework5.task2.component.drive.DriverFactory;
import ru.x5.homework5.task2.component.memory.MemoryFactory;
import ru.x5.homework5.task2.component.monitor.MonitorFactory;
import ru.x5.homework5.task2.component.processor.ProcessorFactory;

public class OfficeComputerStrategy implements ComputerStrategy {
    @Override
    public Computer createComputer() {
        Computer computer = new Computer();
        computer.addComponent(new ProcessorFactory().getMemory(ComponentType.BASED));
        computer.addComponent(new MemoryFactory().getMemory(ComponentType.BASED));
        computer.addComponent(new DriverFactory().getMemory(ComponentType.BASED));
        computer.addComponent(new MonitorFactory().getMemory(ComponentType.BASED));
        return computer;
    }
}
