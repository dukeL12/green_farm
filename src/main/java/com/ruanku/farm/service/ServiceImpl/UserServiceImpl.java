package com.ruanku.farm.service.ServiceImpl;

import com.ruanku.farm.mapper.UserMapping;
import com.ruanku.farm.pojo.User;
import com.ruanku.farm.service.UserServiceInter;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserServiceInter {
    @Resource
    private UserMapping usermapping;
    @Override
//    @Cacheable(value = {"selUserByAccount"}/*,keyGenerator = "myKeyGenerator",condition = "#a0>1",unless = "#a0==2"*/)
    public User selUserByAccount(String user_account) {
        //System.out.println("查询员工名"+user_account);
        return usermapping.selUserByAccount(user_account);
    }
    @Override
    public void inUser(String account,String name,String password,String email,String phone,String address) {

         usermapping.inUser(account, name, password, email, phone, address);
    }
    @Override
    public int selUserIdByAccount(String user_account){
//        System.out.println(usermapping.selUserIdByAccount(user_account));
        return usermapping.selUserIdByAccount(user_account);
    }

}
