package com.ruanku.farm.controller;

import com.ruanku.farm.pojo.User;
import com.ruanku.farm.service.UserServiceInter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class RegisterController {
    @Resource
    private UserServiceInter userServiceInter;

    @PostMapping("/farm/registering")
//    @RequestMapping("/boot/login")
//    @GetMapping("/boot/login")
    public String login(@RequestParam("account")String account, @RequestParam("name")String name,@RequestParam("password")String password, @RequestParam("email")String email,@RequestParam("phone")String phone,@RequestParam("address")String address,@RequestParam("optionsRadios")String optionsRadios, Model model) {
        System.out.println(optionsRadios);
        if(optionsRadios.equalsIgnoreCase("option3")){
            User user =  userServiceInter.selUserByAccount(account);
            if(account.equals("")||password.equals("")){
                return "User_register";
            }
            if (user==null){
                userServiceInter.inUser( account, name, password, email, phone, address);
                model.addAttribute("sucok", "注册成功，请登录");
                return "User_regSuccess";
            }
            else{
                return "User_register";
            }
        }
        else{
            return "1";
        }


    }


}