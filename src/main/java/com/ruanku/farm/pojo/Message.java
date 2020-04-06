package com.ruanku.farm.pojo;

public class Message {
    private int Message_id;
    private int Message_receiveId;
    private int Message_sendId;
    private String Message_info;

    public int getMessage_id() {
        return Message_id;
    }

    public void setMessage_id(int message_id) {
        Message_id = message_id;
    }

    public int getMessage_receiveId() {
        return Message_receiveId;
    }

    public void setMessage_receiveId(int message_receiveId) {
        Message_receiveId = message_receiveId;
    }

    public int getMessage_sendId() {
        return Message_sendId;
    }

    public void setMessage_sendId(int message_sendId) {
        Message_sendId = message_sendId;
    }

    public String getMessage_info() {
        return Message_info;
    }

    public void setMessage_info(String message_info) {
        Message_info = message_info;
    }
}
