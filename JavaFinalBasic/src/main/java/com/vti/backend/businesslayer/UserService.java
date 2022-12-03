package com.vti.backend.businesslayer;

import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserService {
    private IUserRepository userRepository;

    public UserService(){
        userRepository = new UserRepository();
    }

    @Override
    public List<User> getListUser() throws SQLException, IOException, ClassNotFoundException {

        return userRepository.getListUser();
    }

    @Override
    public void showUser() throws SQLException, IOException, ClassNotFoundException {
        userRepository.showUser();
    }

    @Override
    public User getUserById(int id) throws SQLException, IOException, ClassNotFoundException {
        return userRepository.getUserById(id);
    }

    @Override
    public void addUser(String email, String fullName) throws SQLException, IOException, ClassNotFoundException {
        userRepository.addUser(email,fullName);
    }

    @Override
    public int getUserId(String email, String password) throws SQLException, IOException, ClassNotFoundException {
        return userRepository.getUserId(email, password);
    }

    @Override
    public void deleteUserById(int id) throws SQLException, IOException, ClassNotFoundException {
        userRepository.deleteUserById(id);
    }


}
