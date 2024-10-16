package com.example.mblog.mapper;

import com.example.mblog.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select id from user where account = #{account} && password = #{password}")
    public Integer list(User user);

    @Select("select username from user where account = #{account} && password = #{password}")
    public String list2(User user);

    @Insert("insert into user(account, password, username, avator, points, intro) values(#{account},#{password},#{account},'error',0,'null');")
    public Integer regis(User user);

    @Select("select id from user where account = #{account} && password = #{password}")
    public String username(User user);

    @Select("select * from user where id = #{id}")
    public List<User> userall(User user);

    @Update(value = "update user set password = #{password} where id = #{id}")
    public Integer passchange(User user);

    @Update("update user set intro = #{intro} where id = #{id}")
    public Integer introchange(User user);

    @Update("update user set username = #{username} where id = #{id}")
    public Integer namechange(User user);

    @Select("select username from user where id = #{userid}")
    public String selename(Integer userid);
}
