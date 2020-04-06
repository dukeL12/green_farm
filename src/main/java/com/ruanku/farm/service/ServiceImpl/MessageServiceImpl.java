package com.ruanku.farm.service.ServiceImpl;

import com.ruanku.farm.mapper.MessageMapper;
import com.ruanku.farm.pojo.Message;
import com.ruanku.farm.service.MessageServiceInter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageServiceInter {
    @Resource
    private MessageMapper messageMapper;
    @Override
    public List<Message> selMessByRR(int Message_receiveId, int Message_sendId){
        return messageMapper.selMessByRR(Message_receiveId,Message_sendId);
    }

    @Override
    public void userInMess(int Message_receiveId,int Message_sendId,String Message_info){
        messageMapper.userInMess(Message_receiveId, Message_sendId, Message_info);
    }
}
