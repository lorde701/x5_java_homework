package ru.x5.homework5.task2.computer;

import ru.x5.homework5.task2.CustomIllegalArgumentException;
import ru.x5.homework5.task2.component.videocard.CheapVideoCardStrategy;
import ru.x5.homework5.task2.component.videocard.ExpensiveVideoCardStrategy;
import ru.x5.homework5.task2.component.videocard.VideoCardStrategy;

public class ComputerFacade {

    public Computer create(ComputerType type, ComputerCost cost) {
        ComputerFactory computerFactory = null;
        switch (type) {
            case GAMING:
                computerFactory = getGamingComputerFactory(cost);
                break;
            case OFFICE:
                computerFactory = new OfficeComputerFactory();
                break;
            default:
                throw new CustomIllegalArgumentException(String.format("Для типа %s не задана реализация", type));
        }
        return computerFactory.createComputer();
    }

    private GamingComputerFactory getGamingComputerFactory(ComputerCost cost) {
        VideoCardStrategy videoCardStrategy = getVideoCardStrategy(cost);
        return new GamingComputerFactory(videoCardStrategy);
    }

    private VideoCardStrategy getVideoCardStrategy(ComputerCost cost) {
        switch (cost) {
            case EXPENSIVE:
                return new ExpensiveVideoCardStrategy();
            case CHEAP:
                return new CheapVideoCardStrategy();
            default:
                throw new CustomIllegalArgumentException(String.format("Для типа %s не задана реализация", cost));
        }
    }


}
