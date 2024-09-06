package com.example.mblog.service.impl;

import com.example.mblog.mapper.PreviewMapper;
import com.example.mblog.pojo.Previews;
import com.example.mblog.service.Likes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LikesA implements Likes {
    @Autowired
    private PreviewMapper previewmapper;
    @Override
    public Integer list(Previews preview) {
        Integer select = previewmapper.prelike(preview);
        if(select != null) {
            return 0;                                             //判断该文章是否点赞过，如果已经点赞过返回0
        }
        else {
            return previewmapper.like(preview);
        }
    }
}
