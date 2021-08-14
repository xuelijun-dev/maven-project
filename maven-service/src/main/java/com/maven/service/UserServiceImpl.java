package com.maven.service;

import com.maven.api.UserService;
import com.maven.dao.UserDao;
import com.maven.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public User getUser() {
        return userDao.getUser();
    }
}
