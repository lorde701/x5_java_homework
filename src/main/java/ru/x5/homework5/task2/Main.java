package ru.x5.homework5.task2;

import ru.x5.homework5.task2.computer.ComputerCost;
import ru.x5.homework5.task2.computer.ComputerFacade;
import ru.x5.homework5.task2.computer.ComputerType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            ComputerType computerType = getComputerType(sc);
            ComputerCost computerCost = null;
            if (computerType == ComputerType.GAMING) {
                computerCost = getComputerCost(sc);
            }

            ComputerFacade computerFacade = new ComputerFacade();
            System.out.println(computerFacade.create(computerType, computerCost));
        } catch (CustomIllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static ComputerType getComputerType(Scanner sc) {
        System.out.println("Выберите тип компьютера: GAMING - игровой, OFFICE - офисный");
        try {
            return ComputerType.valueOf(sc.next());
        } catch (IllegalArgumentException e) {
            throw new CustomIllegalArgumentException("Был введен неверный тип компьютера");
        }
    }

    private static ComputerCost getComputerCost(Scanner sc) {
        System.out.println("Выберите стоимость: EXPENSIVE - дорогой, CHEAP - дешевый");
        try {
            return ComputerCost.valueOf(sc.next());
        } catch (IllegalArgumentException e) {
            throw new CustomIllegalArgumentException("Было введено неверное значение стоимости");
        }
    }
}



