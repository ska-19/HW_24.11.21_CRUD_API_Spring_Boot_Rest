package com.example.HW_241._CRUD_API_Spring_Boot_Rest;

public class UserRP {
    private long id;
    private String username;
    private String password;
    private String r_password;
    private Integer age;

    public UserRP() { }
    public UserRP(String username, String password,String r_password, Integer age) {
        this.username = username;
        this.password = password;
        this.r_password = r_password;
        this.age = age;
    }
    public UserRP(String username, String password, Integer age) {
        this.username = username;
        this.password = password;
        this.r_password = password;
        this.age = age;
    }

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
    public String getR_password() {
        return r_password;
    }
    public void setR_password(String password) {
        this.r_password = r_password;
    }

        public Integer getAge(){
            return age;
        }
        public void setAge(Integer age) {
            this.age = age;
        }
}

