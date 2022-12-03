package com.vti.backend.businesslayer;

import com.vti.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserService {

    List<User> getListUser() throws SQLException, IOException, ClassNotFoundException;
    void showUser() throws SQLException, IOException, ClassNotFoundException;

    User getUserById(int id) throws SQLException, IOException, ClassNotFoundException;

    void addUser(String email, String fullName) throws SQLException, IOException, ClassNotFoundException;

    int getUserId(String email, String password) throws SQLException, IOException, ClassNotFoundException;

    void deleteUserById(int id) throws SQLException, IOException, ClassNotFoundException;
}
