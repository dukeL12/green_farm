package com.ruanku.farm.pojo;

public class Produce {
    private int Pro_id;
    private String Pro_name;
    private String Pro_gif;
    private String Pro_price;
    private String Pro_address;
    private int Bns_id;
    private  String pro_type;
    private int type_id;
    private String Pro_Detail;

    public String getPro_type() {
        return pro_type;
    }

    public void setPro_type(String pro_type) {
        this.pro_type = pro_type;
    }

    public Produce() {
    }

    public String getPro_Detail() {
        return Pro_Detail;
    }

    public void setPro_Detail(String pro_Detail) {
        Pro_Detail = pro_Detail;
    }

    public int getPro_id() {
        return Pro_id;
    }

    public void setPro_id(int pro_id) {
        Pro_id = pro_id;
    }

    public String getPro_name() {
        return Pro_name;
    }

    public void setPro_name(String pro_name) {
        Pro_name = pro_name;
    }

    public String getPro_gif() {
        return Pro_gif;
    }

    public void setPro_gif(String pro_gif) {
        Pro_gif = pro_gif;
    }

    public String getPro_price() {
        return Pro_price;
    }

    public void setPro_price(String pro_price) {
        Pro_price = pro_price;
    }

    public String getPro_address() {
        return Pro_address;
    }

    public void setPro_address(String pro_address) {
        Pro_address = pro_address;
    }

    public int getBns_id() {
        return Bns_id;
    }

    public void setBns_id(int bns_id) {
        Bns_id = bns_id;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }
}
