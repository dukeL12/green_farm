package com.ruanku.farm.service;

import com.github.pagehelper.Page;
import com.ruanku.farm.pojo.comment;

import java.util.List;

public interface CommentServiceInter {
    List<comment> selComByProId(int Pro_id);
    comment user_selComByProId(int Pro_id);
    void user_AddCom(int user_id,String comment_info,int Pro_id);
    Page<comment> selCommByUserId(int user_id);
    void del_CommentById(int comment_id);
    comment user_selComByComId(int comment_id);
    void user_EditComment(int comment_id,String comment_info);
}
