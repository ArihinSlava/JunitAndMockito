package com.example.junitandmockito.DAO;

import com.example.junitandmockito.model.User;
import com.example.junitandmockito.services.impl.UserDaoImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDaoTest {

    private final UserDaoImpl userDaoImpl = new UserDaoImpl();


    @Test
    public void shouldReturnUserByName() {
        Assertions.assertEquals(new User("Ivan"),userDaoImpl.getUserByName("Ivan"));
    }

    @Test
    public void shouldReturnNotNullUserName() {
        Assertions.assertNotNull(userDaoImpl.getUserByName("Nikolay"));
    }
}
