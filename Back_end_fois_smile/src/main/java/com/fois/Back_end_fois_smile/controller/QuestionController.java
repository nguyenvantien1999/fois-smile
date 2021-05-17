package com.fois.Back_end_fois_smile.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fois.Back_end_fois_smile.entity.Question;
import com.fois.Back_end_fois_smile.mapper.QuestionMapper;

@RequestMapping("/question")
@CrossOrigin()
@Controller
public class QuestionController {
    @Autowired
    QuestionMapper questionMapper;
    
    @RequestMapping(produces = "application/json")
    @ResponseBody
    public ArrayList<Question> getAllQuestion(String mabai) {
        return this.questionMapper.getAllQuestion(mabai);
    }

}
