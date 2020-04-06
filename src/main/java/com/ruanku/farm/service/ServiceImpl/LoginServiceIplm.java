package com.ruanku.farm.service.ServiceImpl;


import com.ruanku.farm.entity.Admin;
import com.ruanku.farm.entity.Business;
import com.ruanku.farm.mapper.LoginMapper;
import com.ruanku.farm.pojo.User;
import com.ruanku.farm.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceIplm implements LoginService {
    @Resource
    private LoginMapper loginMapper;

    //用户
    @Override
    public User validUser(User user){
        return loginMapper.validUser(user);
    }

    @Override
    public User userExit(String account) {
        return loginMapper.userExit(account);
    }

    @Override
    public List<User> findAllUser() {
        return loginMapper.findAllUser();
    }

    @Override
    public void newUser (User user){
        loginMapper.newUser(user);
    }

    //商家
    @Override
    public Business validBusiness(Business business){
        return loginMapper.validBusiness(business);
    }

    public Business allowedBusiness(Business business){
        return loginMapper.allowedBusiness(business);
    }

    @Override
    public Business businessExit(String account) {
        return loginMapper.businessExit(account);
    }

    @Override
    public List<Business> findAllBusiness() {
        return loginMapper.findAllBusiness();
    }

    @Override
    public void newBusiness (Business business){
        loginMapper.newBusiness(business);
    }

    //商家
    @Override
    public Admin validAdmin(Admin admin){
        return loginMapper.validAdmin(admin);
    }
}