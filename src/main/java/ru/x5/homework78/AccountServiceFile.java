package ru.x5.homework78;

import ru.x5.homework78.exception.NotEnoughMoneyException;
import ru.x5.homework78.exception.UnknownAccountException;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class AccountServiceFile implements AccountService {
    private static AccountServiceFile instance = null;
    private final String FILE_PATH = "accounts.txt";
    private final List<Account> defaultAccounts = Arrays.asList(
            new Account(1, "Петов", 123123),
            new Account(2, "Иванов", 5000),
            new Account(3, "Сидоров", 34000),
            new Account(4, "Смирнов", 900000),
            new Account(5, "Курочкин", 6550),
            new Account(6, "Орлов", 6542),
            new Account(7, "Лебедев", 34899),
            new Account(8, "Воробьв", 87000),
            new Account(9, "Голубев", 349000),
            new Account(10, "Петухов", 570000)
    );

    private AccountServiceFile() {
        try {
            File file = new File(FILE_PATH);
            if (!file.exists()) {
                file.createNewFile();
                fullAccounts(defaultAccounts);
            }
        } catch (IOException e) {
            throw new RuntimeException("Не удалось выполнить действия с файлом");
        }
    }

    public static AccountServiceFile getInstance() {
        if (instance == null) {
            instance = new AccountServiceFile();
        }
        return instance;
    }

    @Override
    public void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Account account = findByAccountId(accountId);
        if (amount <= account.getAmount()) {
            System.out.println(String.format("Со счета %s снята сумма %s", accountId, amount));
        } else {
            throw new NotEnoughMoneyException(
                    String.format("На счету %s недостаточно средств. Введенная сумма %s. Сумма на счету %s",
                            account.getId(), amount, account.getAmount()));
        }
    }

    @Override
    public void balance(int accountId) throws UnknownAccountException {
        Account account = findByAccountId(accountId);
        System.out.println(String.format("Баланс счета %s равен %s", account.getId(), account.getAmount()));
    }

    @Override
    public void deposit(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        if (amount < 10) {
            throw new NotEnoughMoneyException("Минимальная сумма для пополнения 10. Введенная сумма " + amount);
        }
        Account account = findByAccountId(accountId);
        System.out.println(String.format("На счет %s внесена сумма: %s", account.getId(), amount));
    }

    @Override
    public void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Account accountFrom = findByAccountId(from);
        if (accountFrom.getAmount() < amount) {
            throw new NotEnoughMoneyException(
                    String.format("На счету %s недостаточно средств. Введенная сумма %s. Сумма на счету %s",
                            accountFrom.getId(), amount, accountFrom.getAmount()));
        }
        Account accountTo = findByAccountId(to);
        System.out.println(String.format("Средства переведены со счета %s на счет %s", from, to));
    }

    private Account findByAccountId(int accountId) throws UnknownAccountException {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String str = null;
            while ((str = reader.readLine()) != null && str.length() != 0) {
                String[] arr = str.split("\\|");
                if (Integer.parseInt(arr[0]) == accountId) {
                    return new Account(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]));
                }
            }
            throw new UnknownAccountException("Аккаунт не был найден");
        } catch (NumberFormatException ex) {
            throw new NumberFormatException(String.format("В файле %s указан неверный тип", FILE_PATH));
        } catch (IOException e) {
            throw new RuntimeException("Не удалось выполнить действия с файлом");
        }
    }


    private void fullAccounts(List<Account> accounts) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (Account account : accounts) {
                writer.println(account.getId() + "|" + account.getHolder() + "|" + account.getAmount());
            }
        }
    }
}
