package com.fois.Back_end_fois_smile.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fois.Back_end_fois_smile.entity.CorrectAnswer;
import com.fois.Back_end_fois_smile.mapper.CorrectAnswerMapper;

@RequestMapping("/correctanswer")
@CrossOrigin()
@Controller
public class CorrectAnswerController {
    @Autowired
    CorrectAnswerMapper correctAnswerMapper;
    
    @RequestMapping(produces = "application/json")
    @ResponseBody
    public ArrayList<CorrectAnswer> getAllCorrectAnswer(String machc) {
        return this.correctAnswerMapper.getAllCorrectAnswer(machc);
    }
}
