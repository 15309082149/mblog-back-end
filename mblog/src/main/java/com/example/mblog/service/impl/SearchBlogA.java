package com.example.mblog.service.impl;

import com.example.mblog.mapper.BlogMapper;
import com.example.mblog.pojo.Blog;
import com.example.mblog.service.SearchBlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SearchBlogA implements SearchBlog {
    @Autowired
    private BlogMapper blogmapper;
    @Override
    public List<Blog> search(String value) {
        return blogmapper.searchblog(value);
    }
}
