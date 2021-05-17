package com.fois.Back_end_fois_smile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendMailService {
    @Autowired
    JavaMailSender javaMailSender;
    
    public void sendMail(String to, String text, String sub) {
        
        SimpleMailMessage message = new SimpleMailMessage();
        
        message.setTo(to);
        message.setSubject(sub);
        message.setText(text);
        
        javaMailSender.send(message);
    }
}
