package com.example.mblog.service.impl;

import com.example.mblog.mapper.UserMapper;
import com.example.mblog.pojo.User;
import com.example.mblog.service.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginA implements Login{
    @Autowired
    private UserMapper usermapper;
    @Override
    public Integer list(User user) {
        return usermapper.list(user);
    }
}
