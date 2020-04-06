package com.ruanku.farm.mapper;

import com.ruanku.farm.entity.Admin;
import com.ruanku.farm.entity.Business;
import com.ruanku.farm.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface LoginMapper {

    User validUser(User user);

    User userExit(String account);

    void newUser(User user);

    List<User> findAllUser();

    //商家
    Business validBusiness(Business business);

    Business allowedBusiness(Business business);

    Business businessExit(String account);

    void newBusiness(Business business);

    List<Business> findAllBusiness();

    //管理员
    Admin validAdmin(Admin admin);

}
