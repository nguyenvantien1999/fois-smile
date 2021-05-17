package com.fois.Back_end_fois_smile.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fois.Back_end_fois_smile.entity.Test;
import com.fois.Back_end_fois_smile.mapper.TestMapper;

@RequestMapping("/test")
@CrossOrigin()
@Controller
public class TestController {
    @Autowired
    TestMapper testMapper;
    
    @RequestMapping(produces = "application/json")
    @ResponseBody
    public ArrayList<Test> getAllTest() {
        return this.testMapper.getAllTest();
    }

}
