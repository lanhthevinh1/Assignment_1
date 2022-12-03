package com.vti.backend.presentationlayer;

import com.vti.backend.businesslayer.AccountService;
import com.vti.backend.businesslayer.IAccountService;
import com.vti.entity.Account;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class AccountController {
    private IAccountService accountService = new AccountService();

    public List<Account> getListAccount() throws SQLException, IOException, ClassNotFoundException {
        return accountService.getListAccount();
    }
}
