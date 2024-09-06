package com.example.mblog.controller;

import com.example.mblog.mapper.UserMapper;
import com.example.mblog.pojo.User;
import com.example.mblog.service.Regis;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class RegisController {
    @Autowired
    private Regis regis;
    @PostMapping("/regis")
    public String Regis(@RequestBody User user) {
        System.out.println(user);
        String result = regis.list(user);
        return "1";
    }
}
