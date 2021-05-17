package com.fois.Back_end_fois_smile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fois.Back_end_fois_smile.entity.Account;
import com.fois.Back_end_fois_smile.mapper.AccountMapper;
import com.fois.Back_end_fois_smile.service.SendPassToMailService;

@RequestMapping("/sendpasstomail")
@CrossOrigin()
@Controller
public class SendMailPassController {
    @Autowired
    AccountMapper accountMapper;
    
    @Autowired
    SendPassToMailService sendMail;
    
    @RequestMapping(produces = "application/json")
    @ResponseBody
    public Boolean sendPassToMail(String username) {
        Account account = accountMapper.getAccByMail(username);
        
        if(account == null) {
            return false;
        }
        else {
            sendMail.sendMail(account);
            return true;
        }
    }
}
