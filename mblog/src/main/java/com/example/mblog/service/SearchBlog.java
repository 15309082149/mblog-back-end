package com.example.mblog.service;

import com.example.mblog.pojo.Blog;

import java.util.List;

public interface SearchBlog {
    public List<Blog> search(String value);
}
