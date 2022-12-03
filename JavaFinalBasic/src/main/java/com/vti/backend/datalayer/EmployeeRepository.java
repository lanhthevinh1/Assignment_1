package com.vti.backend.datalayer;

import com.vti.utils.JDBCUtils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Stack;

public class EmployeeRepository implements IEmployeeRepository {
    private JDBCUtils jdbcUtils;

    public EmployeeRepository(){
        jdbcUtils = new JDBCUtils();
    }

    @Override
    public void CreateEmployee(String email, String fullName, String proSkills) throws SQLException, IOException, ClassNotFoundException {
        UserRepository userRepository = new UserRepository();

        userRepository.addUser(email, fullName);

        int id = userRepository.getUserId(email, "123456");

        String sql = "\n" +
                "INSERT INTO Employee (ID, ProSkill)\n" +
                "VALUES\t\t\t   (?, ?);";

        Connection connection = jdbcUtils.connection();

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,proSkills);

        int effectiedRecordAmount = preparedStatement.executeUpdate();

        System.out.println("Employee created: " + effectiedRecordAmount);

    }
}
