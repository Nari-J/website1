package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("url")
public class UrlController02 {

    //    ip: localhost:8080/url/u01.do

    //    数组可对应多个地址
    @RequestMapping(value ={"/u01_01","/u01","/u01_2"},method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView u01(){
        ModelAndView mv=new ModelAndView();
//        设置视图
        mv.setViewName("hello");
//        设置模型数据
        mv.addObject("hello","hello SpringMvc");
        return mv;
    }

}