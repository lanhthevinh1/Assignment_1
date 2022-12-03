package com.vti.backend.businesslayer;

import com.vti.backend.datalayer.AccountRepository;
import com.vti.backend.datalayer.IAccountRepository;
import com.vti.entity.Account;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class AccountService implements IAccountService {
    public IAccountRepository accountRepository = new AccountRepository();

    @Override
    public List<Account> getListAccount() throws SQLException, IOException, ClassNotFoundException {
        return accountRepository.getListAccount();
    }
}
