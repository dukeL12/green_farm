package com.ruanku.farm.service.ServiceImpl;

import com.github.pagehelper.Page;
import com.ruanku.farm.mapper.ProOrdMapper;
import com.ruanku.farm.pojo.ProOrd;
import com.ruanku.farm.service.ProOrdServiceInter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProOrdServiceImpl implements ProOrdServiceInter {
    @Resource
    private ProOrdMapper proOrdMapper;

    @Override
    public void User_inProOrd( String ProOrd_name,int user_id,int Pro_id,String ProOrd_type){

        proOrdMapper.User_inProOrd(ProOrd_name, user_id, Pro_id ,ProOrd_type);
    }
    @Override
    public Page<ProOrd> find_ProOrderByUserId(int user_id){
        Page<ProOrd> proOrderByUserId=proOrdMapper.find_ProOrderByUserId(user_id); //调用dao层的方法
        return proOrderByUserId;
    }
    @Override
    public List<ProOrd> find_ProOrdByProId(int ProOrd_id){
        List<ProOrd> ProOrdByProId=proOrdMapper.find_ProOrdByProId(ProOrd_id); //调用dao层的方法
        return ProOrdByProId;
    }
    @Override
    public ProOrd user_selProIdById(int ProOrd_id){
        ProOrd selProIdById=proOrdMapper.user_selProIdById(ProOrd_id); //调用dao层的方法
        return selProIdById;
    }
    @Override
    public void update_ProOrdType(int ProOrd_id,String ProOrd_type){
        proOrdMapper.update_ProOrdType(ProOrd_id,ProOrd_type); //调用dao层的方法
    }
    @Override
    public String selProOrdTypeById(int ProOrd_id){
        return proOrdMapper.selProOrdTypeById(ProOrd_id); //调用dao层的方法
    }
}
