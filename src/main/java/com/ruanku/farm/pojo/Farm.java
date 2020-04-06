package com.ruanku.farm.pojo;

public class Farm {
    public int farm_id;
    private String farm_name;
    private String farm_gif;
    private int farm_price;
    private String farm_loacte;
    private int Bns_id;
    private String farm_detail;

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

    public int getFarm_price() {
        return farm_price;
    }

    public void setFarm_price(int farm_price) {
        this.farm_price = farm_price;
    }

    public String getFarm_loacte() {
        return farm_loacte;
    }

    public void setFarm_loacte(String farm_loacte) {
        this.farm_loacte = farm_loacte;
    }

    public int getBns_id() {
        return Bns_id;
    }

    public void setBns_id(int bns_id) {
        Bns_id = bns_id;
    }

    public String getFarm_detail() {
        return farm_detail;
    }

    public void setFarm_detail(String farm_detail) {
        this.farm_detail = farm_detail;
    }
}
