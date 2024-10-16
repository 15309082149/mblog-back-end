package com.example.mblog.mapper;

import com.example.mblog.pojo.Blog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BlogMapper {
    @Select("select * from blogtext")
    public List<Blog> getblog();
    @Select("select * from content where id=#{id}")
    public Blog getcontent(Integer id);
    @Select("select * from blogtext where id=#{id}")
    public Blog getblogtext(Integer id);

    @Select("select * from blogtext where fl like CONCAT('%',#{fl},'%')")
    public List<Blog> flblog(Blog blog);
    @Select("select * from blogtext where text like CONCAT('%',#{value},'%')")
    public List<Blog> searchblog(String value);

    @Insert("insert into blogtext(title, text, time, fl) values(#{title},#{text},#{time},#{fl});")
    public int addblog1(Blog blog);

    @Insert("insert into content(content) values(#{content})")
    public int addblog2(Blog blog);
}
