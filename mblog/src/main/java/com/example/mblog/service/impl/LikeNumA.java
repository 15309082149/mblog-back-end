package com.example.mblog.service.impl;

import com.example.mblog.mapper.PreviewMapper;
import com.example.mblog.pojo.Previews;
import com.example.mblog.service.LikeNum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class LikeNumA implements LikeNum {
    @Autowired
    private PreviewMapper previewmapper;
    @Override
    public List<Previews> list(Previews preview) {
        return previewmapper.likenum(preview);
    }
}
