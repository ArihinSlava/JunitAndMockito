package com.example.junitandmockito.services.impl;

import com.example.junitandmockito.DAO.UserDao;
import com.example.junitandmockito.model.User;
import com.example.junitandmockito.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUserExist(User user) {
        return userDao.checkUserExist(user);
    }
}
