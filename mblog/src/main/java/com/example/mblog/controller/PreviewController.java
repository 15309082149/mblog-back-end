package com.example.mblog.controller;

import com.example.mblog.pojo.Previews;
import com.example.mblog.service.GetPreviews;
import com.example.mblog.service.LikeNum;
import com.example.mblog.service.Likes;
import com.example.mblog.service.SendPreview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class PreviewController {
    @Autowired
    private SendPreview sendpreview;
    @RequestMapping("/sendmessage")
    public Integer Send(Previews preview) {
        return sendpreview.list(preview);
    }

    @Autowired
    private GetPreviews getpreviews;
    @RequestMapping("/getpreview")
    public List<Previews> get(Previews preview) {
        return getpreviews.list(preview);
    }

    @Autowired
    private Likes likes;
    @RequestMapping("/addlikes")
    public Integer like(Previews preview) {
        Integer result = likes.list(preview);
        return result;
    }

    @Autowired
    private LikeNum likenum;
    @RequestMapping("/likenum")
    private List<Previews> likenum(Previews preview) {
        return likenum.list(preview);
    }
}
