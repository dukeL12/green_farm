package com.ruanku.farm.mapper;

import com.github.pagehelper.Page;
import com.ruanku.farm.entity.Business;
import com.ruanku.farm.pojo.Admin;
import com.ruanku.farm.pojo.Bussiness;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AdminMapper {
    Admin selAdminByAcc(String Account);
    Page<Bussiness> selAllBus();

    List<Business> selAllBusiness();

    void upBusiness(int bns_id);
}
