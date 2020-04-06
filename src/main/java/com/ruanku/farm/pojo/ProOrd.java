package com.ruanku.farm.pojo;

public class ProOrd {
    private int ProOrd_id;
    private String ProOrd_name;
    private String ProOrd_createtime;
    private String ProOrd_state;
    private int user_id;
    private int Pro_id;
    private String ProOrd_type;

    public int getProOrd_id() {
        return ProOrd_id;
    }

    public void setProOrd_id(int proOrd_id) {
        ProOrd_id = proOrd_id;
    }

    public String getProOrd_name() {
        return ProOrd_name;
    }

    public void setProOrd_name(String proOrd_name) {
        ProOrd_name = proOrd_name;
    }

    public String getProOrd_createtime() {
        return ProOrd_createtime;
    }

    public void setProOrd_createtime(String proOrd_createtime) {
        ProOrd_createtime = proOrd_createtime;
    }

    public String getProOrd_state() {
        return ProOrd_state;
    }

    public void setProOrd_state(String proOrd_state) {
        ProOrd_state = proOrd_state;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPro_id() {
        return Pro_id;
    }

    public void setPro_id(int pro_id) {
        Pro_id = pro_id;
    }

    public String getProOrd_type() {
        return ProOrd_type;
    }

    public void setProOrd_type(String proOrd_type) {
        ProOrd_type = proOrd_type;
    }
}
