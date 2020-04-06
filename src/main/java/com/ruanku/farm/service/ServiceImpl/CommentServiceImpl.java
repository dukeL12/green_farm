package com.ruanku.farm.service.ServiceImpl;

import com.github.pagehelper.Page;
import com.ruanku.farm.mapper.CommentMapper;
import com.ruanku.farm.pojo.comment;
import com.ruanku.farm.service.CommentServiceInter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentServiceInter {
    @Resource
    private CommentMapper commentMapper;
    @Override
    public List<comment> selComByProId(int Pro_id){
        List<comment> commentById=commentMapper.selComByProId(Pro_id); //调用dao层的方法
        return commentById;
    }
    public comment user_selComByProId(int Pro_id){
        comment user_selComByProId=commentMapper.user_selComByProId(Pro_id); //调用dao层的方法
        return user_selComByProId;
    }
    public void user_AddCom(int user_id,String comment_info,int Pro_id){
        commentMapper.user_AddCom( user_id, comment_info, Pro_id); //调用dao层的方法
    }
    public Page<comment> selCommByUserId(int user_id){
        Page<comment> commentByUserId=commentMapper.selCommByUserId(user_id); //调用dao层的方法
        return commentByUserId;
    }
    public void del_CommentById(int comment_id){
        commentMapper.del_CommentById( comment_id); //调用dao层的方法
    }
    public comment user_selComByComId(int comment_id){
        return commentMapper.user_selComByComId(comment_id);
    }
    public void user_EditComment(int comment_id,String comment_info){
        commentMapper.user_EditComment(comment_id,comment_info);
    }
}
