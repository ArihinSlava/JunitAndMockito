package com.example.junitandmockito.DAO;

import com.example.junitandmockito.model.User;

import java.util.List;

public interface UserDao {

    User getUserByName(String name);

    List<User> findAllUsers();

    boolean checkUserExist(User user);
}
