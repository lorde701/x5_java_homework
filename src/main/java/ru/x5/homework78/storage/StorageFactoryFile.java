package ru.x5.homework78.storage;

import ru.x5.homework78.AccountService;
import ru.x5.homework78.AccountServiceFile;

public class StorageFactoryFile implements StorageFactory {
    @Override
    public AccountService createAccountService() {
        return AccountServiceFile.getInstance();
    }
}
