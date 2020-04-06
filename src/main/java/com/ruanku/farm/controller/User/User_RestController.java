package com.ruanku.farm.controller.User;

import com.ruanku.farm.pojo.Bussiness;
import com.ruanku.farm.pojo.ProOrd;
import com.ruanku.farm.pojo.User;
import com.ruanku.farm.pojo.comment;
import com.ruanku.farm.service.*;
import net.sf.json.JSONArray;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@RestController
public class User_RestController {
    @Resource
    private ProduceServiceInter produceServiceInter;
    @Resource
    private UserServiceInter userServiceInter;
    @Resource
    private CommentServiceInter commentServiceInter;
    @Resource
    private ProOrdServiceInter proOrdServiceInter;
    @Resource
    private BusinessService businessService;

    @RequestMapping("/user/comment")
    public JSONArray comment(HttpServletResponse response, HttpSession session, int Pro_id, String account_user, Model model)throws IOException {
        System.out.println(Pro_id);
        String acc= session.getAttribute("acc").toString();
        User selUserByAccount = userServiceInter.selUserByAccount(acc);
        List<comment> selComByProId = commentServiceInter.selComByProId(Pro_id);
//        comment ComByProId=commentServiceInter.user_selComByProId(Pro_id);
//        System.out.println(ComByProId.getComment_info());
        System.out.println(selComByProId);
//        response.setContentType("text/html;chatset=utf-8");
//        response.setCharacterEncoding("utf-8");
//        response.getWriter().print(selComByProId);
        JSONArray listArray=JSONArray.fromObject(selComByProId);
//        response.setContentType("text/html;chatset=utf-8");
//        response.setCharacterEncoding("utf-8");
//        System.out.println(listArray);
//        response.getWriter().write(listArray.toString());
        return listArray;

    }

    @RequestMapping("/order/jungle")
    public int jungle(HttpServletResponse response, HttpSession session, int ProOrd_id, String account_user, Model model)throws IOException {
//        System.out.println(ProOrd_id);
        String s = proOrdServiceInter.selProOrdTypeById(ProOrd_id);
        if (s.equalsIgnoreCase("已付款"))  {
            return ProOrd_id;
        }
        else{
            return 0;
        }
    }
//    @RequestMapping("/user/AddComment")
//    public void user_AddComment(@RequestParam("comment_info")String comment_info, HttpServletResponse response, HttpSession session, @RequestParam("ProOrdId") int ProOrdId, String account_user, Model model)throws IOException {
//        System.out.println(ProOrdId);
//        String acc = session.getAttribute("acc").toString();
//        User selUserByAccount = userServiceInter.selUserByAccount(acc);
//        ProOrd x = proOrdServiceInter.user_selProIdById(ProOrdId);
//        commentServiceInter.user_AddCom(selUserByAccount.getUser_id(), comment_info, x.getPro_id());
//    }
    @RequestMapping("/user/delTeacher")
    public void user_DelComment(int comment_id){
        System.out.println(comment_id);
        commentServiceInter.del_CommentById(comment_id);

    }
    @PostMapping("/user/editComment")
    public comment editComment(int comment_id) {
        return commentServiceInter.user_selComByComId(comment_id);
    }

    @PostMapping("/user/updateComment")
    public void updateComment(int comment_id,String comment_info){
        System.out.println(comment_id+comment_info);
        commentServiceInter.user_EditComment(comment_id,comment_info);
    }
    @PostMapping("/user/selUser")
    public User selUser(String user_account) {
        return userServiceInter.selUserByAccount(user_account);
    }
    @PostMapping("/admin/updateType")
    public void updateBus(HttpSession session,String optionsRadios,int data_Bns_id){
//        Bussiness b = businessService.selBusByAcc(session.getAttribute("acc").toString());
//        System.out.println(optionsRadios);
//        System.out.println(b.getBns_id());
        businessService.editBusType(data_Bns_id, optionsRadios);

    }
    @PostMapping("/admin/editBus_type")
    public int editBus_type (int Bns_id){
//        System.out.println(Bns_id);
//        System.out.println(businessService.selBusById(Bns_id).getBns_id());
        return businessService.selBusById(Bns_id).getBns_id();

    }
    @PostMapping("/Bus/BusInPro")
    public void BusInPro(String in_Pro_name,String in_Pro_gif,String in_Pro_price,String in_Pro_address,String in_pro_type,String in_Pro_Detail){
        System.out.println(in_Pro_gif);
    }
    @PostMapping("/Bus/delMyPro")
    public void delMyPro(int Pro_id){
        produceServiceInter.delProById(Pro_id);
    }

}
