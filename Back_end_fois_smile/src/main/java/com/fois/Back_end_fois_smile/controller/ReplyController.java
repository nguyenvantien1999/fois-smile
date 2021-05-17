package com.fois.Back_end_fois_smile.controller;

import java.sql.Date;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fois.Back_end_fois_smile.form.ReplyForm;
import com.fois.Back_end_fois_smile.mapper.ReplyMapper;

@RequestMapping("/reply")
@CrossOrigin()
@Controller
public class ReplyController {
    @Autowired
    ReplyMapper replyMapper;
    
    @RequestMapping(value = "/addreply", produces = "application/json")
    @ResponseBody
    public void addReply(String ndrep, long thoigian, int matk, int mabl) {
        Date tg = new Date(thoigian);
        this.replyMapper.addReply(ndrep, tg, matk, mabl);
    }
    
    @RequestMapping(value = "/getreply", produces = "application/json")
    @ResponseBody
    public ArrayList<ReplyForm> getByMaBL(int mabl) {
        return this.replyMapper.selectByMabl(mabl);
    }
}
