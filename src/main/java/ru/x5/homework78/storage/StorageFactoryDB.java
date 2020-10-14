package ru.x5.homework78.storage;

import ru.x5.homework78.AccountService;
import ru.x5.homework78.AccountServiceDB;

public class StorageFactoryDB implements StorageFactory {
    @Override
    public AccountService createAccountService() {
        return AccountServiceDB.getInstance();
    }
}
