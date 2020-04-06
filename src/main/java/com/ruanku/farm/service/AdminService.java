package com.ruanku.farm.service;

import com.github.pagehelper.Page;
import com.ruanku.farm.entity.Business;
import com.ruanku.farm.pojo.Admin;
import com.ruanku.farm.pojo.Bussiness;

import java.util.List;

public interface AdminService {
    List<Business> selAllBusiness();
    Admin selAdminByAcc(String Account);
//    Page<Bussiness> selAllBus();
    void upBusiness(int bns_id);


}
