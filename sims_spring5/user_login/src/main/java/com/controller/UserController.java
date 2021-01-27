package com.controller;

import com.model.ResultModel;
import com.service.IUserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
@Controller
public class UserController {
    @Resource
    private IUserService userService;
    public ResultModel login(String userName,String userPwd){
        return userService.login(userName,userPwd);

    }

}
