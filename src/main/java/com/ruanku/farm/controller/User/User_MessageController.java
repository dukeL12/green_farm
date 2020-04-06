package com.ruanku.farm.controller.User;

import com.ruanku.farm.pojo.Message;
import com.ruanku.farm.pojo.User;
import com.ruanku.farm.service.MessageServiceInter;
import com.ruanku.farm.service.UserServiceInter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class User_MessageController {
    @Resource
    private MessageServiceInter messageServiceInter;
    @Resource
    private UserServiceInter userServiceInter;
    @RequestMapping("/user/Message_main")
    public String getMessage_main(HttpSession session,@RequestParam("Bns_id") int Message_receiveId, Model model){
        User us = userServiceInter.selUserByAccount(session.getAttribute("acc").toString());
        List<Message> MessByRR=messageServiceInter.selMessByRR(Message_receiveId,us.getUser_id());
        model.addAttribute("MessByRRList", MessByRR);
        model.addAttribute("Message_receiveId", Message_receiveId);

        return "User/User_Message";
    }
    @RequestMapping("/user/sendMessage")
    public String sendMessage(@RequestParam("say") String say,@RequestParam("Bns_id") String Bns_id,HttpSession session,@RequestParam("Bns_id") int Message_receiveId, Model model){
        User us = userServiceInter.selUserByAccount(session.getAttribute("acc").toString());
        messageServiceInter.userInMess(Integer.valueOf(Bns_id),us.getUser_id(),say);
        List<Message> MessByRR=messageServiceInter.selMessByRR(Message_receiveId,us.getUser_id());
        model.addAttribute("MessByRRList", MessByRR);
        model.addAttribute("Message_receiveId", Message_receiveId);


        return "User/User_Message";
    }
}
