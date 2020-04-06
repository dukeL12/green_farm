package com.ruanku.farm.service;

import com.ruanku.farm.pojo.User;

public interface UserServiceInter {
    User selUserByAccount(String user_account);
    int selUserIdByAccount(String user_account);
    void inUser(String account,String name,String password,String email,String phone,String address);
}
