package com.ruanku.farm.controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserMainController {
//    @RequestMapping("/farm/usermain")
//    public String main(Model model){
//
//        return "UserMain";
//    }
@GetMapping("/pay1")
public String pay(Model model){

    return "User/paytest";
}

    @GetMapping("/modelTest")
    public String modelTest(Model model){

        return "User/modelTest";
    }
    @GetMapping("/chat")
    public String chat(Model model){

        return "User/User_Message";
    }
}
