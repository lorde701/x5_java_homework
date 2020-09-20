package ru.x5.homework5.task2.computer;

public class OfficeComputerFactory implements ComputerFactory {
    @Override
    public Computer createComputer() {
        return new OfficeComputer();
    }
}
