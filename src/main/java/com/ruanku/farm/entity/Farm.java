package com.ruanku.farm.entity;

public class Farm {
    private int farm_id;
    private String farm_name;
    private String farm_gif;
    private double farm_price;
    private String farm_locate;
    private int bns_id;
    private String farm_detail;
    private double farm_area;

    public Farm(){

    }

    public Farm(String farm_name,String farm_gif,double farm_price,String farm_locate,int bns_id ,String farm_detail,double farm_area){
        this.farm_name = farm_name;
        this.farm_gif = farm_gif;
        this.farm_price = farm_price;
        this.farm_locate = farm_locate;
        this.bns_id = bns_id;
        this.farm_detail = farm_detail;
        this.farm_area = farm_area;
    }
    public int getFarm_id() {
        return farm_id;
    }

    public void setFarm_id(int farm_id) {
        this.farm_id = farm_id;
    }

    public String getFarm_name() {
        return farm_name;
    }

    public void setFarm_name(String farm_name) {
        this.farm_name = farm_name;
    }

    public String getFarm_gif() {
        return farm_gif;
    }

    public void setFarm_gif(String farm_gif) {
        this.farm_gif = farm_gif;
    }

    public double getFarm_price() {
        return farm_price;
    }

    public void setFarm_price(double farm_price) {
        this.farm_price = farm_price;
    }

    public String getFarm_locate() {
        return farm_locate;
    }

    public void setFarm_locate(String farm_locate) {
        this.farm_locate = farm_locate;
    }

    public int getBns_id() {
        return bns_id;
    }

    public void setBns_id(int bns_id) {
        this.bns_id = bns_id;
    }

    public String getFarm_detail() {
        return farm_detail;
    }

    public void setFarm_detail(String farm_detail) {
        this.farm_detail = farm_detail;
    }

    public double getFarm_area() {
        return farm_area;
    }

    public void setFarm_area(double farm_area) {
        this.farm_area = farm_area;
    }
}
