package com.ruanku.farm.controller.User;

import com.ruanku.farm.config.PhoneCode;
import com.ruanku.farm.pojo.User;
import com.ruanku.farm.service.UserServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class MailTestController {
    @Resource
    JavaMailSender jms;
    PhoneCode phoneCode;
    @Resource
    private UserServiceInter userServiceInter;
    // 随机验证码
    public String achieveCode() {
        String[] beforeShuffle= new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F",
                "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a",
                "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                "w", "x", "y", "z" };
        List list = Arrays.asList(beforeShuffle);
        Collections.shuffle(list);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        String afterShuffle = sb.toString();
        String result = afterShuffle.substring(3, 9);
        System.out.print(result);
        return result;
    }


    @PostMapping("/send")
    public void send(HttpSession session,String send_mail_info){
        //建立邮件消息
        String resultCode = achieveCode();
        SimpleMailMessage mainMessage = new SimpleMailMessage();
        //发送者
        mainMessage.setFrom("2919404583@qq.com");
        //接收者
        User use = userServiceInter.selUserByAccount(session.getAttribute("acc").toString());
        System.out.println(use.getUser_email());
        mainMessage.setTo(use.getUser_email());
        //发送的标题
        mainMessage.setSubject(send_mail_info);
        //发送的内容
        mainMessage.setText(resultCode);
        jms.send(mainMessage);
    }

    @PostMapping("/telphone")
    public void phone (HttpSession session){
        User use = userServiceInter.selUserByAccount(session.getAttribute("acc").toString());
//        System.out.println(session.getAttribute("acc").toString());
//        System.out.println(use.getUser_email());
//        System.out.println(use.getUser_phone());
        phoneCode.getPhonemsg(use.getUser_phone());
    }
}
