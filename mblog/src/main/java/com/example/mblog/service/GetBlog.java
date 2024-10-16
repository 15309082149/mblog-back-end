package com.example.mblog.service;

import com.example.mblog.pojo.Blog;

import java.util.List;

public interface GetBlog {
    public List<Blog> blog();
    public List<Blog> flblog(Blog blog);
    public Blog findblog(Integer id);
    public Blog getblogtext(Integer id);
}
