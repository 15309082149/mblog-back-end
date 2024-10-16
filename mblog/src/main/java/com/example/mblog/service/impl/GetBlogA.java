package com.example.mblog.service.impl;

import com.example.mblog.mapper.BlogMapper;
import com.example.mblog.pojo.Blog;
import com.example.mblog.service.GetBlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class GetBlogA implements GetBlog {
    @Autowired
    private BlogMapper blogmapper;
    @Override
    public List<Blog> blog() {
        return blogmapper.getblog();
    }

    @Override
    public List<Blog> flblog(Blog blog) {
        return blogmapper.flblog(blog);
    }

    @Override
    public Blog findblog(Integer id) {
        return blogmapper.getcontent(id);
    }

    @Override
    public Blog getblogtext(Integer id) {
        return blogmapper.getblogtext(id);
    }

}
