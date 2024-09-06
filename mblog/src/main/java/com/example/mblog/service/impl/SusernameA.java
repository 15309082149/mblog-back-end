package com.example.mblog.service.impl;

import com.example.mblog.mapper.UserMapper;
import com.example.mblog.pojo.User;
import com.example.mblog.service.Susername;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SusernameA implements Susername {
    @Autowired
    private UserMapper usermapper;
    @Override
    public String list(User user) {
        return usermapper.username(user);
    }
}
