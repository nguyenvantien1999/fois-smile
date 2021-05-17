package com.fois.Back_end_fois_smile.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fois.Back_end_fois_smile.entity.Word;
import com.fois.Back_end_fois_smile.mapper.WordMapper;

@RequestMapping("/word")
@CrossOrigin()
@Controller
public class WordController {
    @Autowired
    WordMapper wordmapper;
    
    @RequestMapping(value = "/hiragana/chudon", produces = "application/json")
    @ResponseBody
    public ArrayList<Word> getAllTDHiragana() {
        return this.wordmapper.getAllTDHiragana();
    }
    
    @RequestMapping(value = "/hiragana/chukep", produces = "application/json")
    @ResponseBody
    public ArrayList<Word> getAllTKHiragana() {
        return this.wordmapper.getAllTKHiragana();
    }
    
    @RequestMapping(value = "/katakana/chudon", produces = "application/json")
    @ResponseBody
    public ArrayList<Word> getAllTDKatarana() {
        return this.wordmapper.getAllTDKatakana();
    }
    
    @RequestMapping(value = "/katakana/chukep", produces = "application/json")
    @ResponseBody
    public ArrayList<Word> getAllTKKatarana() {
        return this.wordmapper.getAllTKKatakana();
    }
    
    @RequestMapping(value = "/kanji", produces = "application/json")
    @ResponseBody
    public ArrayList<Word> getAllKanji() {
        return this.wordmapper.getAllTDKanji();
    }
}
