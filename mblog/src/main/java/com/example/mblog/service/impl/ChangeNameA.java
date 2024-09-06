package com.example.mblog.service.impl;

import com.example.mblog.mapper.UserMapper;
import com.example.mblog.pojo.User;
import com.example.mblog.service.ChangeName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChangeNameA implements ChangeName {
    @Autowired
    private UserMapper usermapper;
    @Override
    public Integer list(User user) {
        return usermapper.namechange(user);
    }
}
