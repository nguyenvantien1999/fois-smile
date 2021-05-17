package com.fois.Back_end_fois_smile.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fois.Back_end_fois_smile.entity.ChildQuestion;
import com.fois.Back_end_fois_smile.mapper.ChildQuestionMapper;

@RequestMapping("/childquestion")
@CrossOrigin()
@Controller
public class ChildQuestionController {
    @Autowired
    ChildQuestionMapper childQuestionMapper;
    
    @RequestMapping(produces = "application/json")
    @ResponseBody
    public ArrayList<ChildQuestion> getAllChildQuestion(String mach) {
        return this.childQuestionMapper.getAllChildQuestion(mach);
    }
}
