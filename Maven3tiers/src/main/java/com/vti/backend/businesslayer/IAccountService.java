package com.vti.backend.businesslayer;

import com.vti.entity.Account;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IAccountService {
    List<Account> getListAccount() throws SQLException, IOException, ClassNotFoundException;
}
