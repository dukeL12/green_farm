package com.ruanku.farm.mapper;

import com.ruanku.farm.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapping {
    User selUserByAccount(String user_account);
    int selUserIdByAccount(String user_account);
    void inUser(String account,String name,String password,String email,String phone,String address);
}
