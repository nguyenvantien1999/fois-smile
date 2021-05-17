package com.fois.Back_end_fois_smile.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fois.Back_end_fois_smile.entity.KanjiSyllables;
import com.fois.Back_end_fois_smile.mapper.KanjiSyllablesMapper;

@RequestMapping("/kanji_syllables")
@CrossOrigin()
@Controller
public class KanjiSyllablesController {
    @Autowired
    KanjiSyllablesMapper kanjisyllablesmapper;
    
    @RequestMapping(value = "/on", produces = "application/json")
    @ResponseBody
    public ArrayList<KanjiSyllables> getAllOnyomi(String machu) {
        return this.kanjisyllablesmapper.getAllOnyomi(machu);
    }

    @RequestMapping(value = "/kun", produces = "application/json")
    @ResponseBody
    public ArrayList<KanjiSyllables> getAllKunyomi(@RequestParam("machu") String machu) {
        return this.kanjisyllablesmapper.getAllKunnyomi(machu);
    }
}
