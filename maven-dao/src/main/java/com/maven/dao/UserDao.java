package com.maven.dao;

import com.maven.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public User getUser() {
        return new User("xiaohei", 26);
    }
}
