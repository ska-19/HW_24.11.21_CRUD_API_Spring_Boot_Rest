package com.example.HW_241._CRUD_API_Spring_Boot_Rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRP {
    private long id;
    private String username;
    private String password;

    @JsonProperty("repeatPassword")
    private String repeatPassword;
    private Integer age;

    public UserRP() { }

    public long getId() {
            return id;
        }
        public String getUsername() {
            return username;
        }
        public void setUsername(String username) {
            this.username = username;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
    public String getRepeatPassword() {
        return repeatPassword;
    }
    public void setRepeatPassword(String password) {
        this.repeatPassword = repeatPassword;
    }

        public Integer getAge(){
            return age;
        }
        public void setAge(Integer age) {
            this.age = age;
        }
}

