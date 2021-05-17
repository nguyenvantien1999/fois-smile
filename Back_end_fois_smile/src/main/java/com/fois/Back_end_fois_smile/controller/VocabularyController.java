package com.fois.Back_end_fois_smile.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fois.Back_end_fois_smile.entity.Vocabulary;
import com.fois.Back_end_fois_smile.mapper.VocabularyMapper;

@RequestMapping("/vocabulary")
@CrossOrigin()
@Controller
public class VocabularyController {

    @Autowired
    VocabularyMapper vocabulatyMapper;
    
    @RequestMapping(produces = "application/json")
    @ResponseBody
    public ArrayList<Vocabulary> getAllExample(String mabh) {
        return this.vocabulatyMapper.getAllVocabulary(mabh);
    }
}
