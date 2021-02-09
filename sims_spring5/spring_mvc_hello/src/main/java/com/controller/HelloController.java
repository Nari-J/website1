package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class HelloController {

//    ip: localhost:8080/m01.do
    @RequestMapping("/m01")
    public ModelAndView m01(){
        ModelAndView mv=new ModelAndView();
//        设置视图
        mv.setViewName("hello");
//        设置模型数据
        mv.addObject("hello","hello SpringMvc");
        System.out.println("执行hello");
        return mv;
    }



//    采用model
    @RequestMapping("/m02")
    public String m02(Model model){
        model.addAttribute("hello","hello m02");
        return "hello";
    }
//    采用modelMap
    @RequestMapping("/m03")
    public String m03(ModelMap model){
        model.addAttribute("hello","hello m03");
        return "hello";
    }
//    采用map
    @RequestMapping("/m04")
    public String m04(Map map){
        map.put("hello","hello m04");
        return "hello";
    }

//    原始方法
    @RequestMapping("/m05")
    public  String m05(HttpServletRequest request){
        request.setAttribute("hello","hello m05");
        return "hello";
    }

}
