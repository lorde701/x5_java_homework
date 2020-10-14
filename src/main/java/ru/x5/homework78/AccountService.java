package ru.x5.homework78;

import ru.x5.homework78.exception.NotEnoughMoneyException;
import ru.x5.homework78.exception.UnknownAccountException;

public interface AccountService {
    void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException;

    void balance(int accountId) throws UnknownAccountException;

    void deposit(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException;

    void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException;
}
