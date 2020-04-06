package com.ruanku.farm.entity;


public class Admin {
    private int admin_id;
    private String admin_account;
    private String admin_password;
    private String admin_email;
    private String admin_phone;
    private String admin_address;

    public Admin() {

    }

    public Admin(String admin_account, String admin_password) {
        this.admin_account = admin_account;
        this.admin_password = admin_password;
    }

    public Admin(String admin_account, String admin_password, String admin_email, String admin_phone, String admin_address) {
        this.admin_account = admin_account;
        this.admin_password = admin_password;
        this.admin_email = admin_email;
        this.admin_phone = admin_phone;
        this.admin_address = admin_address;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_account() {
        return admin_account;
    }

    public void setAdmin_account(String admin_account) {
        this.admin_account = admin_account;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public String getAdmin_email() {
        return admin_email;
    }

    public void setAdmin_email(String admin_email) {
        this.admin_email = admin_email;
    }

    public String getAdmin_phone() {
        return admin_phone;
    }

    public void setAdmin_phone(String admin_phone) {
        this.admin_phone = admin_phone;
    }

    public String getAdmin_address() {
        return admin_address;
    }

    public void setAdmin_address(String admin_address) {
        this.admin_address = admin_address;
    }
}
