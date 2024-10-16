package com.example.mblog.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.mblog.pojo.Blog;
import com.example.mblog.service.AddBlog;
import com.example.mblog.service.GetBlog;
import com.example.mblog.service.SearchBlog;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@CrossOrigin
public class BlogController {
    @Autowired
    private GetBlog getblog;
    @Autowired
    private SearchBlog searchblog;
    @Autowired
    private AddBlog addblog;
    @RequestMapping("/blogtext")
    public List<Blog> get() {
        return getblog.blog();
    }
    @RequestMapping("/flqd")
    public List<Blog> fl(Blog blog) {
        return getblog.flblog(blog);
    }

    @RequestMapping("/search")
    public List<Blog> search(String value) {
        return searchblog.search(value);
    }

    @RequestMapping ("/addblog")
    public Integer add(@RequestBody Blog blog) {
        addblog.addblog(blog);
        return 1;
    }
    @RequestMapping("/findblog")
    public Blog find(Integer id) {
        System.out.println(getblog.findblog((id)));
        return getblog.findblog(id);
    }
    @RequestMapping("/getblog")
    public Blog getblog(Integer id) {
        return getblog.getblogtext(id);
    }
}
