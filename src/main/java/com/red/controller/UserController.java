package com.red.controller;

import com.red.entity.User;
import com.red.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl uService;

    @RequestMapping("/selectUserById/{id}")
    public User selectUserById(@PathVariable("id")Integer id) {
        return uService.getUserById(id);
    }

}
