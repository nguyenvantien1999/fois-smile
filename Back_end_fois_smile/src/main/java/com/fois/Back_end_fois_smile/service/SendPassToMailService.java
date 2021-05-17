package com.fois.Back_end_fois_smile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fois.Back_end_fois_smile.entity.Account;
import com.fois.Back_end_fois_smile.entity.AccountInformation;
import com.fois.Back_end_fois_smile.mapper.AccountInformationMapper;

@Service
public class SendPassToMailService {
    @Autowired 
    AccountInformationMapper accountInformationMapper;
    
    @Autowired 
    SendMailService sendMailService;
    
    public void sendMail(Account account) {
        String content = formatContentMail(account);
        String sub = "Cấp lại mật khẩu cho tài khoản đăng nhập FOIS-Smile";
        sendMailService.sendMail(account.getUsername(), content, sub);
    }
    
    public String formatContentMail(Account account) {
        AccountInformation thongtinHV = accountInformationMapper.getAccountInformation(account.getMatk());  
        return "Chào bạn " + thongtinHV.getHoten() + ".\n"
                + "Trung tâm Nhật ngữ FOIS-Smile vừa nhận được lệnh cấp lại mật khẩu cho bạn.\n"
                + "Mật khẩu của bạn là: " + account.getPassword() +"\n"
                + "Hãy ghi nhớ mật khẩu hoặc đổi mật khẩu khác dễ nhớ hơn nhé\n"
                + "Cảm ơn bạn đã đồng hành cùng FOIS-Smile.\n"
                + "Chúc bạn học tập tốt";
    }

}
