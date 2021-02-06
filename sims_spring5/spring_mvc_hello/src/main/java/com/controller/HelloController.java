package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

//    ip: port/项目名/hello.do
    @RequestMapping("/hello")
    public ModelAndView hello(){
        ModelAndView mv=new ModelAndView();
//        设置视图
        mv.setViewName("hello");
//        设置模型数据
        mv.addObject("hello","hello SpringMvc");
        return mv;
    }
}
