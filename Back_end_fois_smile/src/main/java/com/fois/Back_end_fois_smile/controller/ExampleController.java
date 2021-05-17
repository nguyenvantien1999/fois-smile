package com.fois.Back_end_fois_smile.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fois.Back_end_fois_smile.entity.Example;
import com.fois.Back_end_fois_smile.mapper.ExampleMapper;

@RequestMapping("/example")
@CrossOrigin()
@Controller
public class ExampleController {
    @Autowired
    ExampleMapper exampleMapper;
    
    @RequestMapping(produces = "application/json")
    @ResponseBody
    public ArrayList<Example> getAllExample(String machu) {
        return this.exampleMapper.getAllExample(machu);
    }
}
