package com.vti.backend.presentationlayer;

import com.vti.backend.businesslayer.UserService;
import com.vti.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserController {
    private UserService userService;

    public UserController(){
        userService = new UserService();
    }

    public List<User> getListUser() throws SQLException, IOException, ClassNotFoundException {
        return userService.getListUser();
    }

    public void showUser() throws SQLException, IOException, ClassNotFoundException {
        userService.showUser();
    }

    public User getUserById(int id) throws SQLException, IOException, ClassNotFoundException {
        return userService.getUserById(id);
    }

    public void addUser(String email, String fullName) throws SQLException, IOException, ClassNotFoundException {
        userService.addUser(email, fullName);
    }

    public int getUserId(String email, String password) throws SQLException, IOException, ClassNotFoundException {
        return userService.getUserId(email, password);
    }

    public void deleteUserById(int id) throws SQLException, IOException, ClassNotFoundException {
        userService.deleteUserById(id);
    }
}

