package com.example.mblog.service.impl;

import com.example.mblog.mapper.PreviewMapper;
import com.example.mblog.pojo.Previews;
import com.example.mblog.service.SendPreview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SendPreviewsA implements SendPreview {
    @Autowired
    private PreviewMapper previewmapper;
    @Override
    public Integer list(Previews preview) {
        Integer result = previewmapper.list(preview);
        return result;
    }
}
