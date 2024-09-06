package com.example.mblog.service.impl;

import com.example.mblog.mapper.UserMapper;
import com.example.mblog.pojo.User;
import com.example.mblog.service.Regis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegisA implements Regis {
    @Autowired
    private UserMapper usermapper;
    @Override
    public String list(User user) {
        Integer result = usermapper.regis(user);
        return "1";
    }
}
