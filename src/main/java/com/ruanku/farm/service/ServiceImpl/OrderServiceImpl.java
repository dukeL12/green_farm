package com.ruanku.farm.service.ServiceImpl;

import com.github.pagehelper.Page;
import com.ruanku.farm.mapper.OrderMapper;
import com.ruanku.farm.pojo.Order;
import com.ruanku.farm.service.OrderServiceInter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl implements OrderServiceInter {
    @Resource
    private OrderMapper orderMapper;

    @Override
    public void User_inFarmOrder(int user_id,int farm_id ,String FarmOrd_type, String FarmOrd_name){

        orderMapper.User_inFarmOrder( user_id, farm_id ,FarmOrd_type,FarmOrd_name);
    }
    @Override
    public Page<Order> find_orderByUserId(int user_id){
        Page<Order> orderByUserId=orderMapper.find_orderByUserId(user_id); //调用dao层的方法
        return orderByUserId;
    }
}
