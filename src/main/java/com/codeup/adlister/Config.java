package com.codeup.adlister;

public class Config {
    private String url = "jdbc:mysql://localhost/com.codeup.adlister.dao.Ads";
    private String username = "username1";
    private String password = "codeup";

    public String getUrl(){
        return url;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }


}
