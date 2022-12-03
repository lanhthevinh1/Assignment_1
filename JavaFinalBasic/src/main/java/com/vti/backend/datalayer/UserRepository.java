package com.vti.backend.datalayer;

import com.vti.entity.User;
import com.vti.utils.JDBCUtils;

import javax.swing.plaf.nimbus.State;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {
    private JDBCUtils jdbcUtils;

    public UserRepository() {
        jdbcUtils = new JDBCUtils();
    }

    @Override
    public List<User> getListUser() throws SQLException, IOException, ClassNotFoundException {
        Connection connection = jdbcUtils.connection();

        List<User> users = new ArrayList<>();
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM User";
        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()){
            User user = new User(resultSet.getInt("ID"),
                    resultSet.getString("Email"),
                    resultSet.getString("FullName"),
                    resultSet.getString(4));

            users.add(user);
        }

        jdbcUtils.disconnect();

        return users;
    }

    @Override
    public void showUser() throws SQLException, IOException, ClassNotFoundException {
        Connection connection = jdbcUtils.connection();

        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM User";
        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()){
            User user = new User(resultSet.getInt("ID"),
                                    resultSet.getString("Email"),
                                    resultSet.getString("FullName"),
                                    resultSet.getString(4));
            System.out.println(user.toString());
        }

        jdbcUtils.disconnect();
    }

    @Override
    public User getUserById(int id) throws SQLException, IOException, ClassNotFoundException {
        Connection connection = jdbcUtils.connection();

        Statement statement = connection.createStatement();

        String sql = "SELECT * " +
                "FROM User " +
                "WHERE ID = "+id+";";

        System.out.println(sql);
        ResultSet resultSet = statement.executeQuery(sql);

        resultSet.next();
        User user = new User(resultSet.getInt("ID"),
                             resultSet.getString("Email"),
                             resultSet.getString("FullName"),
                             resultSet.getString(1));


        jdbcUtils.disconnect();
        return user;
    }

    @Override
    public void deleteUserById(int id) throws SQLException, IOException, ClassNotFoundException {
        Connection connection = jdbcUtils.connection();

        Statement statement = connection.createStatement();

        String sql = "DELETE " +
                "FROM User " +
                "WHERE ID = ?;";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1,id);

        int effectiedRecordAmount = preparedStatement.executeUpdate();

        System.out.println("Delete User: " + effectiedRecordAmount);

    }

    @Override
    public void addUser(String email, String fullName) throws SQLException, IOException, ClassNotFoundException {
        String sql ="INSERT INTO User (Email, FullName, Password)" +
                "VALUES             (?, ?, ?);";

        Connection connection = jdbcUtils.connection();

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        String password = "123456";
        preparedStatement.setString(1, email);
        preparedStatement.setString(2, fullName);
        preparedStatement.setString(3, password);

        int effectiedRecordAmount = preparedStatement.executeUpdate();

        System.out.println("User created: "+ effectiedRecordAmount);
    }

    @Override
    public int getUserId(String email, String password) throws SQLException, IOException, ClassNotFoundException {
        String sql = "SELECT * FROM User\n" +
                "WHERE Email = '"+email+"' AND Password= '" +password+"';";

        Connection connection = jdbcUtils.connection();

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        int id = resultSet.getInt("ID");

        return id;
    }
}
