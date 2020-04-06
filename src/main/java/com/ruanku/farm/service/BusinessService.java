package com.ruanku.farm.service;

import com.github.pagehelper.Page;
import com.ruanku.farm.entity.*;
import com.ruanku.farm.pojo.Produce;
import com.ruanku.farm.pojo.Bussiness;

import java.util.List;

public interface BusinessService {
    Bussiness selBusByAcc(String Account);
    //农场
    List<Farm> selFarm(int bns_id);

    void editBusType(int Bns_id,String Bns_type);

    void delFarm(int farm_id);

    void addFarm(Farm farm);
    //农产品
    List<Produce> selProduce(int bns_id);

    void delProduce(int pro_id);

    void addProduce(Produce produce);

    Bussiness selBusById(int Bns_id);

    Page<Produce> selProById(int Bns_id);
}
