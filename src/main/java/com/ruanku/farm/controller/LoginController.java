package com.ruanku.farm.controller;

import com.ruanku.farm.entity.Admin;
import com.ruanku.farm.entity.Business;
import com.ruanku.farm.pojo.User;
import com.ruanku.farm.service.ServiceImpl.LoginServiceIplm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @Autowired
    private LoginServiceIplm loginServiceIplm;

    @GetMapping("/")
    public String firstPage(){
        return "login";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @PostMapping("/index")
    public String index(Model model,String account,String password ,String type){
        String targetHtml = "";
        switch (type) {
            case "1"://用户
                User user = new User(account, password);
                if (loginServiceIplm.validUser(user)==null) {
                    targetHtml = "login";
                    model.addAttribute("failedHint", "账号或密码错误");
                } else {
                    targetHtml = "user/indexOfUser";
                    model.addAttribute("account", account);
                }
                break;
            case "2"://商家
                Business business = new Business(account, password);
                if (loginServiceIplm.validBusiness(business) == null) {
                    targetHtml = "login";
                    model.addAttribute("failedHint", "账号或密码错误");
                } else if (loginServiceIplm.allowedBusiness(business) == null) {
                    targetHtml = "login";
                    model.addAttribute("failedHint", "商家未审核");
                } else {
                    targetHtml = "business/indexOfBusiness";
                    model.addAttribute("business",loginServiceIplm.allowedBusiness(business));
                    model.addAttribute("account", account);
                }
                break;
            case "3"://管理员
                Admin admin = new Admin(account, password);
                if (loginServiceIplm.validAdmin(admin) == null) {
                    targetHtml = "login";
                    model.addAttribute("failedHint", "账号或密码错误");
                } else {
                    targetHtml = "admin/indexOfAdmin";
                    model.addAttribute("account", account);
                }
                break;
        }
        return targetHtml;
    }
    @PostMapping("/registerOK")
    public String registerOK(Model model,String account,String password,String password2,String name,String email,String phone,String address,String type){
        String targetHtml = "";
        String failedHint;
        switch(type) {
            case "1":
                if (loginServiceIplm.userExit(account) != null) {
                    failedHint = "该账号已存在";
                    model.addAttribute("failedHint", failedHint);
                    targetHtml = "register";
                } else {
                    User user = new User(account, name, password, email, phone, address);
                    loginServiceIplm.newUser(user);
                    targetHtml = "registerOK";
                }
                break;
            case "2":
                if (loginServiceIplm.businessExit(account) != null) {
                    failedHint = "该账号已存在";
                    model.addAttribute("failedHint", failedHint);
                    targetHtml = "register";
                } else {
                    Business business = new Business(account, name, password, email, phone, address,"0");
                    loginServiceIplm.newBusiness(business);
                    targetHtml = "registerOK";
                }
                break;
        }
        return targetHtml;
    }

}
