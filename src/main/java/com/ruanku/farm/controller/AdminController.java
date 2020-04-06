package com.ruanku.farm.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ruanku.farm.entity.Business;
import com.ruanku.farm.pojo.Admin;
import com.ruanku.farm.pojo.Bussiness;
import com.ruanku.farm.service.AdminService;
import com.ruanku.farm.service.BusinessService;
import com.ruanku.farm.service.BussinessServiceInter;
import com.ruanku.farm.service.ServiceImpl.AdminServiceIplm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AdminController {
    @Autowired
    private AdminServiceIplm asi;
    @Resource
    private AdminService adminService;
    @Resource
    private BussinessServiceInter bussinessServiceInter;
    @Resource
    private BusinessService businessService;
    @PostMapping("/kalaok")
    public String kalaok(Model model){
        List<Business> list = asi.selAllBusiness();
        model.addAttribute("business",list);
        return "admin/shenhe";
    }

    @GetMapping("/kalabuok")
    public String kalabuok(Model model,String bns_id){
        asi.upBusiness(Integer.parseInt(bns_id));

        return kalaok(model);
    }
    @GetMapping("/admin/admin_business_main")
    public String business_main(HttpSession session, String account_user, Integer pageNum, Integer pageSize, Model model){
        PageHelper.startPage(pageNum, 5);
        Page<Bussiness> AllBus= bussinessServiceInter.selAllBus();
        model.addAttribute("AllBus",AllBus);
        session.getAttribute("acc");
//        System.out.println(session.getAttribute("acc"));
        model.addAttribute("acc",session.getAttribute("acc"));
//        model.addAttribute("acc",account_use);
        int pages = AllBus.getPages();//获得总页数
        System.out.println(AllBus);
        System.out.println(pages);
        model.addAttribute("pages",pages);
        return "Admin_business_main";
    }


}
