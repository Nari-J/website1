package com.controller;
import com.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping(value ={"/signIn"},method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView login(){
        ModelAndView mv=new ModelAndView();
//        设置视图
        mv.setViewName("signIn");
//        设置模型数据
        mv.addObject("hello","login page");
        System.out.println("hello");
        return mv;
    }

    @RequestMapping(value = "/checkUser",method = RequestMethod.POST)
    public String checkUser(HttpServletRequest request){
        User user=new User();
        user.setUserName(request.getParameter("username"));
        user.setUserPwd(request.getParameter("password"));
        System.out.println(user);




        return "login/welcome";
    }



}
