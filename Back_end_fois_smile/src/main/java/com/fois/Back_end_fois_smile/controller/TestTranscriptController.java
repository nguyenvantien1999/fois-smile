package com.fois.Back_end_fois_smile.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fois.Back_end_fois_smile.entity.TestTranscript;
import com.fois.Back_end_fois_smile.form.TestTranscriptForm;
import com.fois.Back_end_fois_smile.mapper.TestTranscriptMapper;

@RequestMapping("/testTranscript")
@CrossOrigin()
@Controller
public class TestTranscriptController {
    @Autowired
    TestTranscriptMapper testTranscriptMapper;

    @RequestMapping(value = "/add", produces = "application/json")
    @ResponseBody
    public void addTranscript(String record) {
        ObjectMapper om = new ObjectMapper();
        TestTranscript transcript;
        try {
            transcript = om.readValue(record, TestTranscript.class);
            this.testTranscriptMapper.insertTestTranscript(transcript);
        } catch (JsonMappingException e) {
        } catch (JsonProcessingException e) {
        }
    }
    @RequestMapping(value = "/get", produces = "application/json")
    @ResponseBody
    public ArrayList<TestTranscriptForm> getTranscript(int matk) {
        return this.testTranscriptMapper.getTestTranscript(matk);
    }
}
