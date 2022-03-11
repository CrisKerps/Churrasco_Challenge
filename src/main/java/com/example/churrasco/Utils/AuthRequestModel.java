package com.example.churrasco.Utils;

public class AuthRequestModel {

    private String username;
    private String password;

    public AuthRequestModel() {
    }

    public AuthRequestModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}