package com.ruanku.farm.service;


import com.ruanku.farm.entity.Admin;
import com.ruanku.farm.entity.Business;
import com.ruanku.farm.pojo.User;

import java.util.List;

public interface LoginService {

    //用户登录注册
    User validUser(User user);

    User userExit(String account);

    List<User> findAllUser();

    void newUser(User user);

    //商家登录注册
    Business validBusiness(Business business);

    Business allowedBusiness(Business business);

    Business businessExit(String account);

    List<Business> findAllBusiness();

    void newBusiness(Business business);

    //管理员
    Admin validAdmin(Admin admin);
}
