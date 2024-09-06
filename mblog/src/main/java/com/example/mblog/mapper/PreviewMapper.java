package com.example.mblog.mapper;

import com.example.mblog.pojo.Previews;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface PreviewMapper {
    @Insert("insert into preview(id,userid,content,time,username) values(#{id},#{userid},#{content},#{time},#{username})")
    public Integer list(Previews previews);

    @Select("select * from preview where id = #{id}")
    public List<Previews> get(Previews preview);

    @Update("update preview set username = #{username} where userid = #{userid}")
    public Integer change(Integer userid, String username);

    @Insert("insert into likes(id, userid) values(#{id},#{userid})")
    public Integer like(Previews preview);

    @Select("select userid from likes where id = #{id} && userid = #{userid}")
    public Integer prelike(Previews preview);

    @Select("select * from likes where id = #{id}")
    public List<Previews> likenum(Previews preview);

}
