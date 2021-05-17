package com.fois.Back_end_fois_smile.controller;

import java.sql.Date;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fois.Back_end_fois_smile.form.CommentForm;
import com.fois.Back_end_fois_smile.mapper.CommentMapper;

@RequestMapping("/comment")
@CrossOrigin()
@Controller
public class CommentController {
    @Autowired
    CommentMapper commentMapper;
    
    @RequestMapping(value = "/addcomment", produces = "application/json")
    @ResponseBody
    public void addComment(String ndbl, long thoigian, int matk, String mabh) {
        Date tg = new Date(thoigian);
        this.commentMapper.addComment(ndbl, tg, matk, mabh);
    }
    
    @RequestMapping(value = "/getcomment", produces = "application/json")
    @ResponseBody
    public ArrayList<CommentForm> getByMaBH(String mabh) {
        return this.commentMapper.selectByMabh(mabh);
    }
}
