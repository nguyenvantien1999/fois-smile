package com.fois.Back_end_fois_smile.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fois.Back_end_fois_smile.entity.Answer;
import com.fois.Back_end_fois_smile.mapper.AnswerMapper;

@RequestMapping("/answer")
@CrossOrigin()
@Controller
public class AnswerController {
    @Autowired
    AnswerMapper answerMapper;
    
    @RequestMapping(produces = "application/json")
    @ResponseBody
    public ArrayList<Answer> getAllAnswer(String machc) {
        return this.answerMapper.getAllAnswer(machc);
    }
}
