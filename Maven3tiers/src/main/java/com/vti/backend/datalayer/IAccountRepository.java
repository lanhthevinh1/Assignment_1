package com.vti.backend.datalayer;

import com.vti.entity.Account;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IAccountRepository {
    List<Account> getListAccount() throws SQLException, IOException, ClassNotFoundException;
}
