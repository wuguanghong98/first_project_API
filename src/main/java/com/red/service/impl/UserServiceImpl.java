package com.red.service.impl;

import com.red.dao.UserMapper;
import com.red.entity.User;
import com.red.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper uMapper;

    @Override
    public User getUserById(Integer id) {
        return uMapper.selectById(id);
    }
}
