package com.fois.Back_end_fois_smile.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fois.Back_end_fois_smile.entity.Kaiwa;
import com.fois.Back_end_fois_smile.entity.KaiwaContent;
import com.fois.Back_end_fois_smile.mapper.KaiwaContentMapper;
import com.fois.Back_end_fois_smile.mapper.KaiwaMapper;

@RequestMapping("/kaiwa")
@CrossOrigin()
@Controller
public class KaiwaController {
    @Autowired
    KaiwaMapper kaiwaMapper;
    
    @Autowired
    KaiwaContentMapper contentMapper;
    
    @RequestMapping(produces = "application/json")
    @ResponseBody
    public ArrayList<Kaiwa> getAllKaiwa() {
        return this.kaiwaMapper.getAllKaiwa();
    } 

    @RequestMapping(value = "/content", produces = "application/json")
    @ResponseBody
    public ArrayList<KaiwaContent> getAllContent(String maht) {
        return this.contentMapper.getAllKaiwaContent(maht);
    }
}
