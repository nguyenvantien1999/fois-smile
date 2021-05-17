package com.fois.Back_end_fois_smile.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fois.Back_end_fois_smile.entity.Listening;
import com.fois.Back_end_fois_smile.mapper.ListeningMapper;

@RequestMapping("/listening")
@CrossOrigin()
@Controller
public class ListeningController {
    @Autowired
    ListeningMapper listeningMapper;
    
    @RequestMapping(produces = "application/json")
    @ResponseBody
    public ArrayList<Listening> getAllListening(String mabh) {
        return this.listeningMapper.getAllListening(mabh);
    }
}
