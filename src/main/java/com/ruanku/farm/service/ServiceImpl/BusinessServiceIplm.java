package com.ruanku.farm.service.ServiceImpl;

import com.github.pagehelper.Page;
import com.ruanku.farm.entity.*;
import com.ruanku.farm.pojo.Produce;
import com.ruanku.farm.mapper.BusinessMapper;
import com.ruanku.farm.pojo.Bussiness;
import com.ruanku.farm.service.BusinessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BusinessServiceIplm implements BusinessService {
    @Resource
    private BusinessMapper businessMapper;

    public List<Farm> selFarm(int bns_id){
        return businessMapper.selFarm(bns_id);
    }

    public void delFarm(int farm_id){
        businessMapper.delFarm(farm_id);
    }

    public void addFarm(Farm farm){
        businessMapper.addFarm(farm);
    }
    //
    public List<Produce> selProduce(int bns_id){
        return businessMapper.selProduce(bns_id);
    }

    public void delProduce(int pro_id){
        businessMapper.delProduce(pro_id);
    }

    public void addProduce(Produce produce){
        businessMapper.addProduce(produce);
    }
    public Bussiness selBusByAcc(String Account){
        return businessMapper.selBusByAcc(Account);
    }
    public void editBusType(int Bns_id,String Bns_type){
        businessMapper.editBusType(Bns_id,Bns_type);
    }
    public Bussiness selBusById(int Bns_id){
        return businessMapper.selBusById(Bns_id);

    }
    public Page<Produce> selProById(int Bns_id){
        return businessMapper.selProById(Bns_id);
    }
}