package com.ruanku.farm.service;

import com.github.pagehelper.Page;
import com.ruanku.farm.pojo.Produce;

import java.util.List;

public interface ProduceServiceInter {
    Page<Produce> find_produce();
    Page<Produce> find_produceByName(String searchByName);
    List<Produce> find_produceById(int pro_id);
    Produce user_SelproduceById(int pro_id);
    void inProByBus(String Pro_name,String Pro_gif,String Pro_price,String Pro_address,int Bns_id,int pro_type,String Pro_Detail,int type_id);
    void delProById(int Pro_id);
}
