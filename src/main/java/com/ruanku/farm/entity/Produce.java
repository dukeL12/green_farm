package com.ruanku.farm.entity;

public class Produce {
    private int pro_id;
    private String pro_name;
    private String pro_gif;
    private Double pro_price;
    private String pro_address;
    private int bns_id;
    private String pro_type;
    private String pro_Detail;

    public Produce(){

    }
    public Produce(String pro_name,String pro_gif,Double pro_price,String pro_address,int bns_id,String pro_type,String pro_Detail){
        this.pro_name = pro_name;
        this.pro_gif = pro_gif;
        this.pro_price = pro_price;
        this.pro_address = pro_address;
        this.bns_id = bns_id;
        this.pro_type = pro_type;
        this.pro_Detail = pro_Detail;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public String getPro_gif() {
        return pro_gif;
    }

    public void setPro_gif(String pro_gif) {
        this.pro_gif = pro_gif;
    }

    public Double getPro_price() {
        return pro_price;
    }

    public void setPro_price(Double pro_price) {
        this.pro_price = pro_price;
    }

    public String getPro_address() {
        return pro_address;
    }

    public void setPro_address(String pro_address) {
        this.pro_address = pro_address;
    }

    public int getBns_id() {
        return bns_id;
    }

    public void setBns_id(int bns_id) {
        this.bns_id = bns_id;
    }

    public String getPro_type() {
        return pro_type;
    }

    public void setPro_type(String pro_type) {
        this.pro_type = pro_type;
    }

    public String getPro_Detail() {
        return pro_Detail;
    }

    public void setPro_Detail(String pro_Detail) {
        this.pro_Detail = pro_Detail;
    }
}
