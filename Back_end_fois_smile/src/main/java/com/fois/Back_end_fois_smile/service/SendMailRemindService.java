package com.fois.Back_end_fois_smile.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import com.fois.Back_end_fois_smile.entity.Account;
import com.fois.Back_end_fois_smile.entity.AccountInformation;
import com.fois.Back_end_fois_smile.mapper.AccountInformationMapper;
import com.fois.Back_end_fois_smile.mapper.AccountMapper;

@Service
public class SendMailRemindService {
    @Autowired
    AccountMapper accountMapper;
    
    @Autowired
    AccountInformationMapper accInfoMaper;
    
    @Autowired
    SendMailService sendMailService;
    
    @Scheduled(cron = "0 0 7 * * *")
    public void checkNgayDN() {
        ArrayList<Account> listAcc = accountMapper.getAllAccHV();
        LocalDate dateNow = LocalDate.now();
        
        listAcc.forEach(acc -> {
            if(acc.getThoigiandn() != null) {
                Period different = Period.between(dateToLocalDate(acc.getThoigiandn()), dateNow);
                if(different.getYears() == 0 && different.getMonths() == 0) {
                    if(different.getDays() == 7 || different.getDays() == 14) {
                        String content = formatContentMail(acc.getMatk(), different.getDays());
                        String sub = "Nhắc nhở trì hoãn học tập";
                        sendMailService.sendMail(acc.getUsername(), content, sub);
                    }
                }
                
            }
            
        });
    }
    public LocalDate dateToLocalDate(Date date) {
        return new java.sql.Date(date.getTime()).toLocalDate();
    }
    public String formatContentMail(int matk, int ngay) {
        AccountInformation thongtinHV = accInfoMaper.getAccountInformation(matk);  
        return "Chào bạn " + thongtinHV.getHoten() + ".\n"
                + "Trung tâm Nhật ngữ FOIS-Smile nhận thấy bạn có sự trì hoãn trong việc học.\n"
                + "Đã " + ngay +" ngày tính từ lần cuối bạn đăng nhập vào tài khoản.\n"
                + "Trung tâm mong bạn sẽ sớm trở lại.\n"
                + "Cảm ơn bạn đã đồng hành cùng FOIS-Smile.\n"
                + "Chúc bạn học tập tốt.";
    }
}
