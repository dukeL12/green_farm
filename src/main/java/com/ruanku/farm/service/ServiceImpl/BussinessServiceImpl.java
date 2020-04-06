package com.ruanku.farm.service.ServiceImpl;

import com.github.pagehelper.Page;
import com.ruanku.farm.mapper.AdminMapper;
import com.ruanku.farm.mapper.BusinessMapper;
import com.ruanku.farm.pojo.Bussiness;
import com.ruanku.farm.service.BussinessServiceInter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BussinessServiceImpl implements BussinessServiceInter {
    @Resource
    private AdminMapper adminmapper;

    @Resource
    private BusinessMapper businessMapper;
    public Page<Bussiness> selAllBus(){
        return adminmapper.selAllBus();
    }
    @Override
    public void inBusiness(int Bns_id,String Bns_account,String Bns_name,String Bns_password,String Bns_email,String Bns_phone,String Bns_address ,String Bns_type,int bns_allowed){
        businessMapper.inBusiness( Bns_id,Bns_account, Bns_name, Bns_password, Bns_email, Bns_phone, Bns_address , Bns_type, bns_allowed);
    }
}
