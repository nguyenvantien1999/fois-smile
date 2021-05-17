package com.fois.Back_end_fois_smile.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fois.Back_end_fois_smile.entity.Progress;
import com.fois.Back_end_fois_smile.mapper.ProgressMapper;

@RequestMapping("/progress")
@CrossOrigin()
@Controller
public class ProgressController {
    @Autowired
    ProgressMapper progressMapper;
    
    @RequestMapping(value = "/insert",produces = "application/json")
    @ResponseBody
    public void insertProgress(int matk, String mabh, boolean tuvung){
        Progress progress =  this.progressMapper.selectByMabh(mabh, matk);
        if(progress == null) {
            this.progressMapper.insertProgress(mabh, matk, tuvung);   
        }
    }
    
    @RequestMapping(value = "/getAll",produces = "application/json")
    @ResponseBody
    public ArrayList<Progress> getAllProgress(int matk){
        return this.progressMapper.getAllProgress(matk);
    }
    
    @RequestMapping(value = "/getAllMaBH",produces = "application/json")
    @ResponseBody
    public ArrayList<String> getMaBHProgress(int matk){
        return this.progressMapper.getMaBHProgress(matk);
    }
    
    @RequestMapping(value = "/updateVob",produces = "application/json")
    @ResponseBody
    public void updateVob(int matk, String mabh){
        this.progressMapper.updateVob(mabh, matk);
    }
    
    @RequestMapping(value = "/updateNP",produces = "application/json")
    @ResponseBody
    public void updateNP(int matk, String mabh){
        this.progressMapper.updateNP(mabh, matk);
    }
    
    @RequestMapping(value = "/updateNghe",produces = "application/json")
    @ResponseBody
    public void updateNghe(int matk, String mabh){
        this.progressMapper.updateNghe(mabh, matk);
    }
    
    @RequestMapping(value = "/updateBT",produces = "application/json")
    @ResponseBody
    public void updateBT(int matk, String mabh){
        this.progressMapper.updateBT(mabh, matk);
    }

}
