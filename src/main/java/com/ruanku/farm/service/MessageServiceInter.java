package com.ruanku.farm.service;

import com.ruanku.farm.pojo.Message;

import java.util.List;

public interface MessageServiceInter {
    List<Message> selMessByRR(int Message_receiveId, int Message_sendId);
    void userInMess(int Message_receiveId,int Message_sendId,String Message_info);
}
