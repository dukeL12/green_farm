package com.ruanku.farm.controller.User;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ruanku.farm.pojo.ProOrd;
import com.ruanku.farm.pojo.User;
import com.ruanku.farm.pojo.comment;
import com.ruanku.farm.service.CommentServiceInter;
import com.ruanku.farm.service.ProOrdServiceInter;
import com.ruanku.farm.service.ProduceServiceInter;
import com.ruanku.farm.service.UserServiceInter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class User_CommentController {
    @Resource
    private ProduceServiceInter produceServiceInter;
    @Resource
    private UserServiceInter userServiceInter;
    @Resource
    private CommentServiceInter commentServiceInter;
    @Resource
    private ProOrdServiceInter proOrdServiceInter;
    @RequestMapping("/user/AddComment")
    public String user_AddComment(@RequestParam("comment_info")String comment_info, HttpServletResponse response, HttpSession session, @RequestParam("ProOrdId") int ProOrdId, String account_user, Model model)throws IOException {
        System.out.println(ProOrdId);
        String acc = session.getAttribute("acc").toString();
        User selUserByAccount = userServiceInter.selUserByAccount(acc);
        ProOrd x = proOrdServiceInter.user_selProIdById(ProOrdId);
        commentServiceInter.user_AddCom(selUserByAccount.getUser_id(), comment_info, x.getPro_id());
        return "User/commentSuccess";
    }
    @RequestMapping("/user/SelCommentAll")
    public String SelCommentAll(int pageNum, HttpServletResponse response, HttpSession session,  String account_user, Model model){
        String acc = session.getAttribute("acc").toString();
        User selUserByAccount = userServiceInter.selUserByAccount(acc);
        PageHelper.startPage(pageNum, 5);
        model.addAttribute("acc",session.getAttribute("acc"));
        Page<comment> CommByUserId= commentServiceInter.selCommByUserId(selUserByAccount.getUser_id());
        model.addAttribute("CommByUserId", CommByUserId);
        int pages = CommByUserId.getPages();//获得总页数
        System.out.println(selUserByAccount.getUser_id());
        System.out.println(pages);
        System.out.println(CommByUserId);

        model.addAttribute("pages",pages);
        return "User/User_Comment_main";
    }
}
