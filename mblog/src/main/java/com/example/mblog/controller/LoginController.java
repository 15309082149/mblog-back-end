package com.example.mblog.controller;

import com.example.mblog.mapper.UserMapper;
import com.example.mblog.pojo.User;
import com.example.mblog.service.Login;
import com.sun.net.httpserver.Authenticator;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class LoginController {
    @Autowired
    private Login login;
    @Autowired
    private UserMapper usermapper;
    @RequestMapping("/login")
    public Integer Login(User user, HttpSession session) {
        System.out.println(user);
        Integer id = login.list(user);
        String username = usermapper.list2(user);
        session.setAttribute("user",username);
        String name = (String) session.getAttribute("user");
        System.out.println(name);
        return id;
    };

}
