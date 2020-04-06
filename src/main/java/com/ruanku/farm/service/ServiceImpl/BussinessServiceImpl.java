package com.ruanku.farm.service.ServiceImpl;

import com.github.pagehelper.Page;
import com.ruanku.farm.mapper.AdminMapper;
import com.ruanku.farm.pojo.Bussiness;
import com.ruanku.farm.service.BussinessServiceInter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BussinessServiceImpl implements BussinessServiceInter {
    @Resource
    private AdminMapper adminmapper;
    public Page<Bussiness> selAllBus(){
        return adminmapper.selAllBus();
    }
}
