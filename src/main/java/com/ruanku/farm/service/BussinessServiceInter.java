package com.ruanku.farm.service;

import com.github.pagehelper.Page;
import com.ruanku.farm.pojo.Bussiness;

public interface BussinessServiceInter {
    Page<Bussiness> selAllBus();
    void inBusiness(int Bns_id,String Bns_account,String Bns_name,String Bns_password,String Bns_email,String Bns_phone,String Bns_address ,String Bns_type,int bns_allowed);
}
