package ru.x5.homework5.task2.computer;

import ru.x5.homework5.task2.CustomIllegalArgumentException;

public class ComputerFacade {

    public Computer create(ComputerType type, ComputerCost cost) {
        ComputerStrategy computerStrategy = null;
        switch (type) {
            case GAMING:
                computerStrategy = getGamingComputerStrategy(cost);
                break;
            case OFFICE:
                computerStrategy = new OfficeComputerStrategy();
                break;
            default:
                throw new CustomIllegalArgumentException(String.format("Для типа %s не задана реализация", type));
        }
        return computerStrategy.createComputer();
    }

    private ComputerStrategy getGamingComputerStrategy(ComputerCost cost) {
        switch (cost) {
            case EXPENSIVE:
                return new ExpensiveGamingComputerStrategy();
            case CHEAP:
                return new CheapGamingComputerStrategy();
        }
        throw new CustomIllegalArgumentException("Не выбрана стоимость игрового компьютера");
    }
}
