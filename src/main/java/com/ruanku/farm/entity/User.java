package com.ruanku.farm.entity;

public class User {
    private int user_id;
    private String user_account;
    private String user_name;
    private String user_password;
    private String user_email;
    private String user_phone;
    private String user_address;

    public User() {

    }

    public User(String user_account, String user_password) {
        this.user_account = user_account;
        this.user_password = user_password;
    }

    public User(String user_account, String user_name, String user_password, String user_email, String user_phone, String user_address) {
        this.user_account = user_account;
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_email = user_email;
        this.user_phone = user_phone;
        this.user_address = user_address;
    }
}
