package com.fois.Back_end_fois_smile.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fois.Back_end_fois_smile.entity.Grammar;
import com.fois.Back_end_fois_smile.mapper.GrammarMapper;

@RequestMapping("/grammar")
@CrossOrigin()
@Controller
public class GrammarController {
    @Autowired
    GrammarMapper grammarMapper;
    
    @RequestMapping(produces = "application/json")
    @ResponseBody
    public ArrayList<Grammar> getAllExample(String mabh) {
        return this.grammarMapper.getAllGrammar(mabh);
    }

}
