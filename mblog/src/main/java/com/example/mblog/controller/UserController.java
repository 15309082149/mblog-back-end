package com.example.mblog.controller;

import com.example.mblog.pojo.User;
import com.example.mblog.service.*;
import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {
    public static Integer state = 1;
    public static void changestate() {
        state *= -1;
    };

    @Autowired
    private Susername suername;
    @RequestMapping("/searchuser")
    public String Username (User user) {
        String result = suername.list(user);
        return result;
    }

    @Autowired
    private Userall userall;
    @RequestMapping("/user")
    public List<User> User (User user) {
        List<User> result = userall.list(user);
        return result;
    }

    @Autowired
    private ChangePass change;
    @RequestMapping("/changepass")
    public Integer ChangePass(User user) {
        return change.list(user);
    }

    @Autowired
    private ChangeIntro changeintro;
    @RequestMapping("/changein")
    public Integer ChangeIn(User user) {
        return changeintro.list(user);
    }

    @Autowired
    private ChangeName changename;
    @RequestMapping("/changename")
    public Integer ChangeName(User user) {
        state = -1;
        return changename.list(user);
    }
}
