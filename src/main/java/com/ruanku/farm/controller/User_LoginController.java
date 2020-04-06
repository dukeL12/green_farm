package com.ruanku.farm.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ruanku.farm.pojo.Admin;
import com.ruanku.farm.pojo.Bussiness;
import com.ruanku.farm.pojo.Farm;
import com.ruanku.farm.pojo.User;
import com.ruanku.farm.service.AdminService;
import com.ruanku.farm.service.BusinessService;
import com.ruanku.farm.service.FarmServiceInter;
import com.ruanku.farm.service.UserServiceInter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class User_LoginController {
    @Resource
    private UserServiceInter userServiceInter;
    @Resource
    private FarmServiceInter farmServiceInter;
    @Resource
    private BusinessService businessService;
    @Resource
    private AdminService adminService;
    @PostMapping("/user_main")
//    @RequestMapping("/boot/login")
//    @GetMapping("/boot/login")
    public String login(@RequestParam("account")String account, @RequestParam("password")String password, @RequestParam("optionsRadios")String optionsRadios, Model model, HttpSession session) {
        System.out.println(optionsRadios);
        if(optionsRadios.equalsIgnoreCase("option3")){
            User user =  userServiceInter.selUserByAccount(account);
//        List<Account> Userlist = userServiceInter.findall();
            //    model.addAttribute("account", account);
//        System.out.println(account.getUsername()+account.getPassword());
            if(user==null){
                return "User_login";
            }
            else{
                if(account.equals("")||password.equals("")) {
                    return "User_login";

                }
                else if(user.getUser_password().equals(password)) {
                    PageHelper.startPage(1, 5);
                    Page<Farm> farmList= farmServiceInter.find_farm();
                    model.addAttribute("farm",farmList);
                    model.addAttribute("acc",account);
                    session.setAttribute("acc",account);
                    int pages = farmList.getPages();//获得总页数
//        System.out.println(pages);
                    model.addAttribute("pages",pages);
                    return "User_farm_main";

                }
                else{
                    return "User_login";
                }
            }
        }
        if(optionsRadios.equalsIgnoreCase("option2")){
            Bussiness busByAcc = businessService.selBusByAcc(account);
            session.setAttribute("acc",account);
            model.addAttribute("acc",account);
            if(busByAcc.getBns_type().equalsIgnoreCase("已审核")){
                if(busByAcc.getBns_password().equalsIgnoreCase(password)){
                    return "Business_main";
                }
                else{
                    return "User_login";
                }
            }
            else{
                return "Bussiness_login_fail";
            }
        }
        else{
            Admin adminByAcc=adminService.selAdminByAcc(account);
            session.setAttribute("acc",account);
            model.addAttribute("acc",account);
            if(adminByAcc.getAdmin_password().equalsIgnoreCase(password)){
                return "Admin_main";
            }
            else{
                return "User_login";
            }
        }


    }


}

