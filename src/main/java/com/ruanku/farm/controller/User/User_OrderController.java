package com.ruanku.farm.controller.User;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ruanku.farm.pojo.Farm;
import com.ruanku.farm.pojo.Order;
import com.ruanku.farm.pojo.Produce;
import com.ruanku.farm.pojo.User;
import com.ruanku.farm.service.FarmServiceInter;
import com.ruanku.farm.service.OrderServiceInter;
import com.ruanku.farm.service.ProduceServiceInter;
import com.ruanku.farm.service.UserServiceInter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class User_OrderController {
    @Resource
    private UserServiceInter userServiceInter;
    @Resource
    private OrderServiceInter orderServiceInter;
    @Resource
    private FarmServiceInter farmServiceInter;
    @Resource
    private ProduceServiceInter produceServiceInter;
    @RequestMapping("/order/User_farm_order")
    public String main(HttpSession session,int farm_id, Model model){
        String user_account=session.getAttribute("acc").toString();
        String FarmOrd_type ="待付款";
//        System.out.println(user_account);
//        System.out.println(farm_id);find_farmById(int farm_id)
        User user =  userServiceInter.selUserByAccount(user_account);
        List<Farm> farmListById=farmServiceInter.find_farmById(farm_id);
        String FarmOrd_name =user.getUser_id()+"and"+farm_id;
//        System.out.println(user.getUser_id());
        orderServiceInter.User_inFarmOrder(user.getUser_id(),farm_id,FarmOrd_type,FarmOrd_name);
        model.addAttribute("farmList", farmListById);
        model.addAttribute("user_account", user_account);
        model.addAttribute("FarmOrd_name", FarmOrd_name);
        model.addAttribute("FarmOrd_type", FarmOrd_type);
        return "User/User_farm_order";
    }

    @RequestMapping("/farmOrd/farmOrd_main")
    public String farmOrd_main(HttpSession session, String account_user, Integer pageNum, Integer pageSize, Model model){

        //获得账户
//        System.out.println(pageNum);
        String user_account=session.getAttribute("acc").toString();
        //获得用户id
        int user_id = userServiceInter.selUserIdByAccount(user_account);
//        System.out.println(user_id);
        PageHelper.startPage(pageNum, 5);
        Page<Order> orderByUserId= orderServiceInter.find_orderByUserId(user_id);

        model.addAttribute("acc",session.getAttribute("acc"));

        model.addAttribute("orderPage",orderByUserId);
        int producepages = orderByUserId.getPages();//获得总页数
//        System.out.println(producepages);
        model.addAttribute("producepages",producepages);
//        System.out.println(orderByUserId);
        return "User/User_FarmOrd_main";
    }
}
