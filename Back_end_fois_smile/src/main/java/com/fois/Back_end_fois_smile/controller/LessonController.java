package com.fois.Back_end_fois_smile.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fois.Back_end_fois_smile.entity.Lesson;
import com.fois.Back_end_fois_smile.mapper.LessonMapper;

@RequestMapping("/lesson")
@CrossOrigin()
@Controller
public class LessonController {
    @Autowired
    LessonMapper lessonMapper;
    
    @RequestMapping(produces = "application/json")
    @ResponseBody
    public ArrayList<Lesson> getAllTDHiragana() {
        return this.lessonMapper.getAllLesson();
    }
}
