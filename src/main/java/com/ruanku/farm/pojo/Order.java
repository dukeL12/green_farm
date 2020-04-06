package com.ruanku.farm.pojo;

public class Order {
    private int FarmOrd_id;
    private String FarmOrd_name;
    private String FarmOrd_createtime;
    private String FarmOrd_state;
    private int user_id;
    private int farm_id;
    private String FarmOrd_type;

    public String getFarmOrd_name() {
        return FarmOrd_name;
    }

    public void setFarmOrd_name(String farmOrd_name) {
        FarmOrd_name = farmOrd_name;
    }

    public String getFarmOrd_type() {
        return FarmOrd_type;
    }

    public void setFarmOrd_type(String farmOrd_type) {
        FarmOrd_type = farmOrd_type;
    }

    public int getFarmOrd_id() {
        return FarmOrd_id;
    }

    public void setFarmOrd_id(int farmOrd_id) {
        FarmOrd_id = farmOrd_id;
    }

    public String getFarmOrd_createtime() {
        return FarmOrd_createtime;
    }

    public void setFarmOrd_createtime(String farmOrd_createtime) {
        FarmOrd_createtime = farmOrd_createtime;
    }

    public String getFarmOrd_state() {
        return FarmOrd_state;
    }

    public void setFarmOrd_state(String farmOrd_state) {
        FarmOrd_state = farmOrd_state;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getFarm_id() {
        return farm_id;
    }

    public void setFarm_id(int farm_id) {
        this.farm_id = farm_id;
    }
}
