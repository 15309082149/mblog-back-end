package com.example.mblog.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class User {
    private String account;
    private String password;
    private String username;
    private String intro;
    private String avator;
    private Integer points;
    private Integer id;

}

