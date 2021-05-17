package com.fois.Back_end_fois_smile.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fois.Back_end_fois_smile.entity.Structure;
import com.fois.Back_end_fois_smile.mapper.StructureMapper;

@RequestMapping("/structure")
@CrossOrigin()
@Controller
public class StructureController {
    @Autowired
    StructureMapper structureMapper;
    
    @RequestMapping(produces = "application/json")
    @ResponseBody
    public ArrayList<Structure> getAllExample(String manp) {
        return this.structureMapper.getAllStructure(manp);
    }
}
