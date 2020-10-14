package ru.x5.homework78;

import ru.x5.homework78.exception.NotEnoughMoneyException;
import ru.x5.homework78.exception.UnknownAccountException;
import ru.x5.homework78.storage.StorageFactory;
import ru.x5.homework78.storage.StorageFactoryDB;
import ru.x5.homework78.storage.StorageFactoryFile;
import ru.x5.homework78.storage.StorageType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите место хранения данных: FILE илм DB");
        Scanner sc = new Scanner(System.in);
        StorageType storageType = null;
        try {
            storageType = StorageType.valueOf(sc.next());
        } catch (IllegalArgumentException ignore) {
           throw new RuntimeException("Неверно выбрано место хранения данных");
        }
        StorageFactory storageFactory = null;
        switch (storageType) {
            case DB:
                storageFactory = new StorageFactoryDB();
                break;
            case FILE:
                storageFactory = new StorageFactoryFile();
                break;
        }
        AccountService service = storageFactory.createAccountService();
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
