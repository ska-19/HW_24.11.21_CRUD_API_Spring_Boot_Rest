package com.example.HW_241._CRUD_API_Spring_Boot_Rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRP {
    private String username;
    private String password;
    //@JsonProperty("repeatPassword")
    private String repPassword;
    private Integer age;

    public UserRP() { }

    public String getUsername() { return username;}
    public String getPassword() { return password; }
    public String getRepPassword() { return repPassword;}
    public Integer getAge(){ return age; }
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setRepeatPassword(String password) { this.repPassword = repPassword; }
    public void setAge(Integer age) {this.age = age; }
}

