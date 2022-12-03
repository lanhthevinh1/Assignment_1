package com.vti.backend.datalayer;

import com.vti.entity.Admin;
import com.vti.utils.JDBCUtils;
import com.vti.utils.ScannerUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AdminRepository implements IAdminRepository {
    private JDBCUtils jdbcUtils;

    public AdminRepository(){
        jdbcUtils = new JDBCUtils();
    }

    @Override
    public void login(String email, String password) throws Exception {
        Connection connection = jdbcUtils.connection();
        Statement statement = connection.createStatement();



        String sql = "SELECT * FROM Admin A\n" +
                "JOIN User U ON U.ID = A.ID\n" +
                "WHERE U.Email = '"+email+"' AND U.Password = '"+password+"';";

        ResultSet  resultSet = statement.executeQuery(sql);

        resultSet.next();
        Admin admin = new Admin(resultSet.getInt("ID"),
                                resultSet.getString("Email"),
                                resultSet.getString("FullName"),
                                resultSet.getString("Password"),
                                resultSet.getInt("ExpInYear"));

        System.out.println(admin);

    }
}
