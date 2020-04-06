package com.ruanku.farm.entity;

public class Business {
    private int bns_id;
    private String bns_account;
    private String bns_name;
    private String bns_password;
    private String bns_email;
    private String bns_phone;
    private String bns_address;
    private String bns_allowed;

    public Business() {

    }
    public Business(String bns_account, String bns_password) {
        this.bns_account = bns_account;
        this.bns_password = bns_password;
    }

    public Business(String bns_account, String bns_name, String bns_password, String bns_email, String bns_phone, String bns_address,String bns_allowed) {
        this.bns_account = bns_account;
        this.bns_name = bns_name;
        this.bns_password = bns_password;
        this.bns_email = bns_email;
        this.bns_phone = bns_phone;
        this.bns_address = bns_address;
        this.bns_allowed = bns_allowed;
    }

    public int getBns_id() {
        return bns_id;
    }

    public void setBns_id(int bns_id) {
        this.bns_id = bns_id;
    }

    public String getBns_account() {
        return bns_account;
    }

    public void setBns_account(String bns_account) {
        this.bns_account = bns_account;
    }

    public String getBns_name() {
        return bns_name;
    }

    public void setBns_name(String bns_name) {
        this.bns_name = bns_name;
    }

    public String getBns_password() {
        return bns_password;
    }

    public void setBns_password(String bns_password) {
        this.bns_password = bns_password;
    }

    public String getBns_email() {
        return bns_email;
    }

    public void setBns_email(String bns_email) {
        this.bns_email = bns_email;
    }

    public String getBns_phone() {
        return bns_phone;
    }

    public void setBns_phone(String bns_phone) {
        this.bns_phone = bns_phone;
    }

    public String getBns_address() {
        return bns_address;
    }

    public void setBns_address(String bns_address) {
        this.bns_address = bns_address;
    }

    public String getBns_allowed() {
        return bns_allowed;
    }

    public void setBns_allowed(String bns_allowed) {
        this.bns_allowed = bns_allowed;
    }
}
