package ru.x5.homework7;

public class Main {
    public static void main(String[] args) {
        AccountService service = new AccountServiceDB();
        try {
            service.balance(3);
        } catch (UnknownAccountException e) {
            System.out.println(e.getMessage());
        }

        try {
            service.deposit(7, 7);
        } catch (NotEnoughMoneyException | UnknownAccountException e) {
            System.out.println(e.getMessage());
        }

        try {
            service.deposit(7, 4520);
        } catch (NotEnoughMoneyException | UnknownAccountException e) {
            System.out.println(e.getMessage());
        }

        try {
            service.transfer(2, 5, 6000);
        } catch (NotEnoughMoneyException | UnknownAccountException e) {
            System.out.println(e.getMessage());
        }

        try {
            service.transfer(2, 5, 2000);
        } catch (NotEnoughMoneyException | UnknownAccountException e) {
            System.out.println(e.getMessage());
        }

        try {
            service.withdraw(9, 45120);
        } catch (NotEnoughMoneyException | UnknownAccountException e) {
            System.out.println(e.getMessage());
        }

        try {
            service.balance(65);
        } catch (UnknownAccountException e) {
            System.out.println(e.getMessage());
        }
    }
}
