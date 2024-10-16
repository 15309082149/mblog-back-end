package com.example.mblog.service.impl;

import com.example.mblog.mapper.BlogMapper;
import com.example.mblog.pojo.Blog;
import com.example.mblog.service.AddBlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddBlogA implements AddBlog {
    @Autowired
    private BlogMapper blogmapper;
    @Override
    public int addblog(Blog blog) {
        blogmapper.addblog1(blog);
        blogmapper.addblog2(blog);
        return 1;
    }
}
