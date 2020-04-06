package com.ruanku.farm.controller.Produce;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ruanku.farm.pojo.Bussiness;
import com.ruanku.farm.pojo.Farm;
import com.ruanku.farm.pojo.Produce;
import com.ruanku.farm.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class Bus_ProduceController {
    @Resource
    private FarmServiceInter farmServiceInter;
    @Resource
    private ProduceServiceInter produceServiceInter;
    @Resource
    private UserServiceInter userServiceInter;
    @Resource
    private CommentServiceInter commentServiceInter;
    @Resource
    private BusinessService businessService;
    @RequestMapping("/produce/bus_produce_main")
    public String getproduce(HttpSession session, String account_user, Integer pageNum, Integer pageSize, Model model){
        PageHelper.startPage(pageNum, 5);
        Page<Produce> produceList= produceServiceInter.find_produce();
        session.getAttribute("acc");
//        System.out.println(session.getAttribute("acc"));
        model.addAttribute("acc",session.getAttribute("acc"));
        model.addAttribute("produce",produceList);
        int producepages = produceList.getPages();//获得总页数
//        System.out.println(pages);
        model.addAttribute("producepages",producepages);
        return "Produce/Bus_produce_main";
    }
    @RequestMapping("/Bus_farm_main")
    public String getFarmList(HttpSession session,String account_user,Integer pageNum, Integer pageSize, Model model){
        PageHelper.startPage(pageNum, 5);
        Page<Farm>  farmList= farmServiceInter.find_farm();
        model.addAttribute("farm",farmList);
        session.getAttribute("acc");
//        System.out.println(session.getAttribute("acc"));
        model.addAttribute("acc",session.getAttribute("acc"));
//        model.addAttribute("acc",account_use);
        int pages = farmList.getPages();//获得总页数
//        System.out.println(account_user);
        model.addAttribute("pages",pages);
        return "business/Bus_farm_main";
    }
    @RequestMapping("/Bus/selProById")
    public String selProById(HttpSession session,Integer pageNum,Model model){
        Bussiness s = businessService.selBusByAcc(session.getAttribute("acc").toString());
        PageHelper.startPage(pageNum, 5);
        Page<Produce> ProById = businessService.selProById(s.getBns_id());
        model.addAttribute("ProById",ProById);
        session.getAttribute("acc");
//        System.out.println(session.getAttribute("acc"));
        model.addAttribute("acc",session.getAttribute("acc"));
//        model.addAttribute("acc",account_use);
        int pages = ProById.getPages();//获得总页数
//        System.out.println(account_user);
        model.addAttribute("pages",pages);
        return "MyBusPro";
    }
}
