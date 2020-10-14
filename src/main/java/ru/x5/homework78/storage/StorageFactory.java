package ru.x5.homework78.storage;

import ru.x5.homework78.AccountService;

public interface StorageFactory {
    AccountService createAccountService();
}
