package com.ruanku.farm.service.ServiceImpl;

import com.github.pagehelper.Page;
import com.ruanku.farm.mapper.ProduceMapper;
import com.ruanku.farm.pojo.Produce;
import com.ruanku.farm.service.ProduceServiceInter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProduceServiceImpl implements ProduceServiceInter {
    @Resource
    private ProduceMapper produceMapper;
    @Override
    public Page<Produce> find_produce() {
        Page<Produce> produceList=produceMapper.find_produce(); //调用dao层的方法
        return produceList;
    }
    @Override
    public Page<Produce> find_produceByName(String searchByName) {
        Page<Produce> produceListByName=produceMapper.find_produceByName(searchByName); //调用dao层的方法
        return produceListByName;
    }
    @Override
    public List<Produce> find_produceById(int pro_id) {
        List<Produce> produceListById=produceMapper.find_produceById(pro_id); //调用dao层的方法
        return produceListById;
    }
    @Override
    public Produce user_SelproduceById(int pro_id) {
        Produce SelproduceById=produceMapper.user_SelproduceById(pro_id); //调用dao层的方法
        return SelproduceById;
    }
    @Override
    public void inProByBus(String Pro_name,String Pro_gif,String Pro_price,String Pro_address,int Bns_id,int pro_type,String Pro_Detail,int type_id){
        produceMapper.inProByBus( Pro_name, Pro_gif, Pro_price, Pro_address, Bns_id, pro_type, Pro_Detail, type_id);
    }
    @Override
    public void delProById(int Pro_id){
        produceMapper.delProById(Pro_id);
    }

}
