package com.po;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//@Data
//@AllArgsConstructor
public class User {
    private Integer id;
    private String userName;
    private String userPwd;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
