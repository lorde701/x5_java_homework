package ru.x5.homework78;

import ru.x5.homework78.exception.NotEnoughMoneyException;
import ru.x5.homework78.exception.UnknownAccountException;

import java.sql.*;

public class AccountServiceDB implements AccountService {
    private String url = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
    private String createTableFile = "./schema.sql";
    private String fullTableFile = "./data.sql";

    private static AccountServiceDB instance;

    private AccountServiceDB() {
        fullDB();
    }

    public static AccountServiceDB getInstance() {
        if (instance == null) {
            instance = new AccountServiceDB();
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

    private void fullDB() {
        try (Connection con = DriverManager.getConnection(String.format(
                "%s;INIT=RUNSCRIPT FROM '%s'\\;RUNSCRIPT FROM '%s'", url, createTableFile, fullTableFile))) {
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Не удалось выполнить действия с БД");
        }
    }

    private Account findByAccountId(int accountId) throws UnknownAccountException {
        try (Connection con = DriverManager.getConnection(url);
             PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM ACCOUNTS WHERE ID = ?")) {
            preparedStatement.setInt(1, accountId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return new Account(resultSet.getInt(1),
                        resultSet.getNString(2),
                        resultSet.getInt(3));
            } else {
                throw new UnknownAccountException("Аккаунт не был найден");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Не удалось выполнить действия с БД");
        }
    }
}
