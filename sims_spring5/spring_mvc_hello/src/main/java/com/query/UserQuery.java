package com.query;

import lombok.Data;

import java.util.List;

@Data
public class UserQuery {

    private Integer id;
    private String userName;
    private  String phone;

    private List<String> nicks;
}
