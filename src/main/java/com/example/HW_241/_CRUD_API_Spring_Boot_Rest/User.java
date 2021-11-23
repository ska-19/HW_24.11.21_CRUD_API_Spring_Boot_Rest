package com.example.HW_241._CRUD_API_Spring_Boot_Rest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "age")
    private Integer age;

    public User() { }
    public User(String username, String password, Integer age) {
        this.username = username;
        this.password = password;
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

    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" +
                password + ", age=" + age + "]";
    }

//    public String toStringNoPassword() {
//        return "User [id=" + id + ", username=" + username + ", age=" + age + "]";
//    }
}