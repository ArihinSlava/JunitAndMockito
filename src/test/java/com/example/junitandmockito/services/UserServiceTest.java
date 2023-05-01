package com.example.junitandmockito.services;

import com.example.junitandmockito.model.User;
import com.example.junitandmockito.services.impl.UserDaoImpl;
import com.example.junitandmockito.services.impl.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    User Polina = new User("Polina");
    User Valeriy = new User("Valeriy");

    @Mock
    private UserDaoImpl userDaoMock;

    @InjectMocks
    private UserServiceImpl userServiceImpl;

    @Test
    public void shouldCheckIfUserExist() {
        when(userDaoMock.checkUserExist(Polina)).thenReturn(true);
        Assertions.assertTrue(userServiceImpl.checkUserExist(Polina));
    }

    @Test
    public void shouldCheckIfUserNotExist() {
        when(userDaoMock.checkUserExist(Valeriy)).thenReturn(false);
        Assertions.assertFalse(userServiceImpl.checkUserExist(Valeriy));

    }
}
