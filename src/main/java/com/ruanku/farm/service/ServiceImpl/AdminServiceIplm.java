package com.ruanku.farm.service.ServiceImpl;

import com.github.pagehelper.Page;
import com.ruanku.farm.entity.Business;
import com.ruanku.farm.mapper.AdminMapper;
import com.ruanku.farm.pojo.Admin;
import com.ruanku.farm.pojo.Bussiness;
import com.ruanku.farm.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceIplm implements AdminService {

    @Resource
    private AdminMapper adminmapper;

    @Override
    public List<Business> selAllBusiness() {
        return adminmapper.selAllBusiness();
    }

    @Override
    public void upBusiness(int bns_id) {
        adminmapper.upBusiness(bns_id);
    }

    @Override
    public Admin selAdminByAcc(String Account) {
        return adminmapper.selAdminByAcc(Account);
    }
//    public Page<Bussiness> selAllBus(){
//        return adminmapper.selAllBus();
//    }
}
