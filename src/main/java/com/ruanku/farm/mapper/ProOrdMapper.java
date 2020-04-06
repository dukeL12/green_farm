package com.ruanku.farm.mapper;

import com.github.pagehelper.Page;
import com.ruanku.farm.pojo.ProOrd;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProOrdMapper {
    Page<ProOrd> find_ProOrderByUserId(int user_id);
    void User_inProOrd(String ProOrd_name,int user_id,int Pro_id,String ProOrd_type);
    List<ProOrd> find_ProOrdByProId(int ProOrd_id);
    ProOrd user_selProIdById(int ProOrd_id);
    void update_ProOrdType(int ProOrd_id,String ProOrd_type);
    String selProOrdTypeById(int ProOrd_id);
}
