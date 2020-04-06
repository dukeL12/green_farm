package com.ruanku.farm.service;

import com.github.pagehelper.Page;
import com.ruanku.farm.pojo.Order;

public interface OrderServiceInter {
    Page<Order> find_orderByUserId(int user_id);
    void User_inFarmOrder(int user_id,int farm_id,String FarmOrd_type,String FarmOrd_name);
//    List<Order> find_farmById(int farm_id);
}
