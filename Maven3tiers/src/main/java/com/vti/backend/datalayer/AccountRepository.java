package com.vti.backend.datalayer;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Position;
import com.vti.utils.JDBCUtils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountRepository implements IAccountRepository {
    private JDBCUtils jdbcUtils;

    public AccountRepository(){
        jdbcUtils = new JDBCUtils();

    }

    @Override
    public List<Account> getListAccount() throws SQLException, IOException, ClassNotFoundException {
        List<Account> accounts = new ArrayList<Account>();

        Connection connection = jdbcUtils.connection();

        String sql = "SELECT * FROM company.account";

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()){
            Account account = new Account(resultSet.getInt("AccountID"),
                                            resultSet.getString("Email"),
                                            resultSet.getString("Username"),
                                            resultSet.getString("Fullname"),
                                            new Department(resultSet.getInt("DepartmentID")),
                                            new Position(resultSet.getInt("PositionID")),
                                            resultSet.getDate("CreateDate"));
            accounts.add(account);
        }
        jdbcUtils.disconnect();
        return accounts;
    }

}
