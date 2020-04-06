package com.ruanku.farm.mapper;

import com.github.pagehelper.Page;
import com.ruanku.farm.entity.*;
import com.ruanku.farm.pojo.Produce;
import com.ruanku.farm.pojo.Bussiness;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BusinessMapper {

    List<Farm> selFarm(int bns_id);

    Bussiness selBusByAcc(String Account);

    void delFarm(int farm_id);

    void addFarm(Farm farm);
    //
    List<Produce> selProduce(int bns_id);

    void delProduce(int pro_id);

    void addProduce(Produce produce);

    void editBusType(int Bns_id,String Bns_type);

    Bussiness selBusById(int Bns_id);

    Page<Produce> selProById(int Bns_id);

    void inBusiness(int Bns_id,String Bns_account,String Bns_name,String Bns_password,String Bns_email,String Bns_phone,String Bns_address ,String Bns_type,int bns_allowed);
}
