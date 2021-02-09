package com.controller;

import com.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @RequestMapping("user/queryUserByUserId")
    public void queryUserByUserId(String uname,Integer id){
        System.out.println(uname+"   "+id);
    }
    @RequestMapping("user/test")
    public void test(HttpServletRequest request){
        System.out.println(request.getAttribute("hello"));
        System.out.println("testing...");
    }
    @RequestMapping("user/login")
    public void login(HttpSession session){
        User user=new User();
        user.setId(20);
        user.setUserPwd("1234");
        user.setUserName("jiran");
        session.setAttribute("user",user);
        System.out.println("用户登陆成功");
    }

}
