package com.ruanku.farm.controller.Farm;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ruanku.farm.pojo.Farm;
import com.ruanku.farm.service.FarmServiceInter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class User_FarmController {

    @Resource
    private FarmServiceInter farmServiceInter;

    //http://localhost:8080/farmList?pageNum=1&pageSize=2
    @RequestMapping("/farmList")
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
        return "User_farm_main";
    }
    @RequestMapping("/farmListByName")
    public String getFarmListByName(HttpSession session,@RequestParam("searchByName")String searchByName, @RequestParam("account_user")String account_user, Integer pageNum, Integer pageSize, Model model){
        PageHelper.startPage(pageNum, 5);
        Page<Farm>  farmList= farmServiceInter.find_farmByName(searchByName);
        model.addAttribute("farm",farmList);
        session.getAttribute("acc");
//        System.out.println(session.getAttribute("acc"));
        model.addAttribute("acc",session.getAttribute("acc"));
        int pages = farmList.getPages();//获得总页数
        System.out.println(account_user);
        model.addAttribute("pages",pages);
        return "User_farm_main";
    }

    @RequestMapping("/farm/farm_detail")
    public String user_main(HttpSession session, int farm_id,String account_user,Model model){
        //System.out.println(produce_id+account_user);
        List<Farm> farmListById=farmServiceInter.find_farmById(farm_id);
        session.getAttribute("acc");
//        System.out.println(session.getAttribute("acc"));
        model.addAttribute("acc",session.getAttribute("acc"));
        model.addAttribute("farmById",farmListById);
        return "farm/User_farm_detail";
    }

}
