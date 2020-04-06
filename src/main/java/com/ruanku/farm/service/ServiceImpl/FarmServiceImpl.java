package com.ruanku.farm.service.ServiceImpl;

import com.github.pagehelper.Page;
import com.ruanku.farm.mapper.FarmMapper;
import com.ruanku.farm.pojo.Farm;
import com.ruanku.farm.service.FarmServiceInter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FarmServiceImpl implements FarmServiceInter {
    @Resource
    private FarmMapper farmMapper;
    @Override
    public Page<Farm> find_farm() {
        Page<Farm> FarmList=farmMapper.find_farm(); //调用dao层的方法
        return FarmList;
    }
    @Override
    public Page<Farm> find_farmByName(String searchByName) {
        Page<Farm> farmByName=farmMapper.find_farmByName(searchByName); //调用dao层的方法
        return farmByName;
    }
    @Override
    public List<Farm> find_farmById(int farm_id) {
        List<Farm> farmByName=farmMapper.find_farmById(farm_id); //调用dao层的方法
        return farmByName;
    }
}
