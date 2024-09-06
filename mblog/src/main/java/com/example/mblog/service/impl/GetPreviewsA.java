package com.example.mblog.service.impl;

import com.example.mblog.controller.UserController;
import com.example.mblog.mapper.PreviewMapper;
import com.example.mblog.mapper.UserMapper;
import com.example.mblog.pojo.Previews;
import com.example.mblog.service.GetPreviews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetPreviewsA implements GetPreviews {
    @Autowired
    private PreviewMapper previewmapper;
    @Autowired
    private UserMapper usermapper;
    @Override
    public List<Previews> list(Previews preview) {
        List<Previews> previews1 = previewmapper.get(preview);
        Integer state = UserController.state;
        if(state == -1) {
            for (int i = 0; i < previews1.size(); i++) {
                Previews p = previews1.get(i);
                Integer userid = p.getUserid();
                String username = usermapper.selename(userid);
                previewmapper.change(userid, username);
            }
            UserController.changestate();
        }
        return previewmapper.get(preview);
    }
}
