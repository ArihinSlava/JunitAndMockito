package com.example.junitandmockito.services.impl;

import com.example.junitandmockito.DAO.UserDao;
import com.example.junitandmockito.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDaoImpl implements UserDao {

    private final List<User> users = new ArrayList<>();

    public UserDaoImpl() {
        users.add(new User("Ivan"));
        users.add(new User("Slava"));
        users.add(new User("Irina"));
        users.add(new User("Elena"));
        users.add(new User("Nikolay"));
    }

    @Override
    public User getUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return new User(name);
            }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }

    @Override
    public boolean checkUserExist(User user) {
        return users.contains(user);
    }
}
