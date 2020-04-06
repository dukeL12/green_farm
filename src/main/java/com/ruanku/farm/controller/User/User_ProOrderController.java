package com.ruanku.farm.controller.User;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ruanku.farm.pojo.ProOrd;
import com.ruanku.farm.pojo.Produce;
import com.ruanku.farm.pojo.User;
import com.ruanku.farm.service.ProOrdServiceInter;
import com.ruanku.farm.service.ProduceServiceInter;
import com.ruanku.farm.service.UserServiceInter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class User_ProOrderController {
    @Resource
    private UserServiceInter userServiceInter;
    @Resource
    private ProOrdServiceInter proOrdServiceInter;
    @Resource
    private ProduceServiceInter produceServiceInter;
    @RequestMapping("/order/User_Pro_order")
    public String main(HttpSession session, int Pro_id, Model model){
        String user_account=session.getAttribute("acc").toString();
        String ProOrd_type ="待付款";
//        System.out.println(user_account);
//        System.out.println(farm_id);find_farmById(int farm_id)
        User user =  userServiceInter.selUserByAccount(user_account);
        List<Produce> proListById=produceServiceInter.find_produceById(Pro_id);

        String ProOrd_name =user.getUser_id()+"and"+Pro_id;
//        System.out.println(user.getUser_id());
        proOrdServiceInter.User_inProOrd(ProOrd_name ,user.getUser_id(), Pro_id,ProOrd_type);
        model.addAttribute("proList", proListById);
        model.addAttribute("user_account", user_account);
        model.addAttribute("ProOrd_name", ProOrd_name);
        model.addAttribute("ProOrd_type", ProOrd_type);
        return "User/User_Pro_order";
    }

    @RequestMapping("/proOrd/proOrd_main")
    public String farmOrd_main(HttpSession session, String account_user, Integer pageNum, Integer pageSize, Model model){
        //获得账户
        String user_account=session.getAttribute("acc").toString();
        //获得用户id
        int user_id = userServiceInter.selUserIdByAccount(user_account);
        System.out.println(user_id);
        PageHelper.startPage(pageNum, 5);
        Page<ProOrd> proListById=proOrdServiceInter.find_ProOrderByUserId(user_id);
        model.addAttribute("acc",session.getAttribute("acc"));

        model.addAttribute("proListById",proListById);
        int producepages = proListById.getPages();//获得总页数
        System.out.println(producepages);
        model.addAttribute("producepages",producepages);
        System.out.println(proListById);
        return "User/User_ProOrd_main";
    }
//    @RequestMapping("/proOrd/proOrd_detail")
//    public String proOrd_detail(HttpSession session,int ProOrd_id,String account_user,Model model){
////        System.out.println(produce_id+account_user);
//        List<ProOrd> ProOrdByProId=proOrdServiceInter.find_ProOrdByProId(ProOrd_id);
//        session.getAttribute("acc");
////        System.out.println(session.getAttribute("acc"));
//        model.addAttribute("acc",session.getAttribute("acc"));
//        model.addAttribute("ProOrdByProId",ProOrdByProId);
//        return "User/User_ProOrd_detail";
//    }
}
