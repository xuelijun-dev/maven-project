package com.maven.web;

import com.maven.api.UserService;
import com.maven.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("getUser")
    public User getUser() {
        return userService.getUser();
    }
}
