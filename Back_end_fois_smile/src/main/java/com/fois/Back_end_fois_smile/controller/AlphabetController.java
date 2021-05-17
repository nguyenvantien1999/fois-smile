package com.fois.Back_end_fois_smile.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fois.Back_end_fois_smile.entity.Alphabet;
import com.fois.Back_end_fois_smile.mapper.AlphabetMapper;

@RequestMapping("/alphabet")
@CrossOrigin()
@Controller
public class AlphabetController {
    @Autowired
    AlphabetMapper alphabetMapper;
    
    @RequestMapping(produces = "application/json")
    @ResponseBody
    public ArrayList<Alphabet> getAllTDHiragana() {
        return this.alphabetMapper.getAll();
    }
}
