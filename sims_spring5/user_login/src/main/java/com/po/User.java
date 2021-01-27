package com.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Data
@AllArgsConstructor
public class User {
    private Integer id;
    private String userName;
    private String userPwd;


}
