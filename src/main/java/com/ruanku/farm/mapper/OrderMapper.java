package com.ruanku.farm.mapper;

import com.github.pagehelper.Page;
import com.ruanku.farm.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    Page<Order> find_orderByUserId(int user_id);
    void User_inFarmOrder(int user_id,int farm_id,String FarmOrd_type, String FarmOrd_name);
}
