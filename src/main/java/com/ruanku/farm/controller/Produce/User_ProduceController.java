package com.ruanku.farm.controller.Produce;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ruanku.farm.pojo.Produce;
import com.ruanku.farm.pojo.User;
import com.ruanku.farm.pojo.comment;
import com.ruanku.farm.service.CommentServiceInter;
import com.ruanku.farm.service.ProduceServiceInter;
import com.ruanku.farm.service.UserServiceInter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
public class User_ProduceController {
    @Resource
    private ProduceServiceInter produceServiceInter;
    @Resource
    private UserServiceInter userServiceInter;
    @Resource
    private CommentServiceInter commentServiceInter;
    @RequestMapping("/produce/produce_main")
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
        return "Produce/User_produce_main";
    }
    @RequestMapping("/produceListByName")
    public String getFarmListByName(HttpSession session,@RequestParam("searchByName")String searchByName,@RequestParam("account_user")String account_user,Integer pageNum, Integer pageSize, Model model){
        PageHelper.startPage(pageNum, 5);
        Page<Produce>  produceListByName= produceServiceInter.find_produceByName(searchByName);
        session.getAttribute("acc");
//        System.out.println(session.getAttribute("acc"));
        model.addAttribute("acc",session.getAttribute("acc"));
        model.addAttribute("produce",produceListByName);
        int pages = produceListByName.getPages();//获得总页数
//        System.out.println(pages);
        model.addAttribute("pages",pages);
        return "Produce/User_produce_main";
    }

    @RequestMapping("/produce/produce_detail")
    public String user_main(HttpSession session,int produce_id,String account_user,Model model){
//        System.out.println(produce_id+account_user);
        List<Produce> produceListById=produceServiceInter.find_produceById(produce_id);
        session.getAttribute("acc");
//        System.out.println(session.getAttribute("acc"));
        model.addAttribute("acc",session.getAttribute("acc"));
        model.addAttribute("produceListById",produceListById);
        return "Produce/User_produce_detail";
    }
//    @RequestMapping("/user/comment")
//    public comment comment(HttpServletResponse response, HttpSession session, int Pro_id, String account_user, Model model)throws IOException {
//        System.out.println(Pro_id);
//        String acc= session.getAttribute("acc").toString();
//        User selUserByAccount = userServiceInter.selUserByAccount(acc);
//        comment ComByProId=commentServiceInter.user_selComByProId(Pro_id);
////        System.out.println(ComByProId.getComment_info());
////        response.setContentType("text/html;chatset=utf-8");
////        response.setCharacterEncoding("utf-8");
////        response.getWriter().print(ComByProId);
//        return ComByProId;
//
//
//    }
}
