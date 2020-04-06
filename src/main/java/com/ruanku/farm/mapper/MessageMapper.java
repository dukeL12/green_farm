package com.ruanku.farm.mapper;

import com.ruanku.farm.pojo.Message;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper {
    List<Message> selMessByRR(int Message_receiveId,int Message_sendId);
    void userInMess(int Message_receiveId,int Message_sendId,String Message_info);
}
