package com.example.mblog.service.impl;

import com.example.mblog.mapper.UserMapper;
import com.example.mblog.pojo.User;
import com.example.mblog.service.Userall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserallA implements Userall {
    @Autowired
    private UserMapper usermapper;

    @Override
    public List<User> list(User user) {
        return usermapper.userall(user);
    }

}
