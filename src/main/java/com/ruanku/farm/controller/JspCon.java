package com.ruanku.farm.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@Controller
//@RestController
public class JspCon {

    @GetMapping("/farm/register")
    public String register(Model model){
        return "User_register";
    }

    @GetMapping("/farm/login")
    public String login(Model model){
        return "User_login";
    }

    @GetMapping("/farm/index")
    public String index(Model model){
        return "User_index";
    }



//    @RequestMapping("/start")
//    @ResponseBody
//    public String startSpringBoot() {
//        return "welcome spring boot";
//    }

}