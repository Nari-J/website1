package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//页面转发与重定向
@Controller
public class DispatcherRedirectController {



//    重定向

    @RequestMapping("v01")
    public String v01(){
        return "redirect:v02.jsp?uname=纪然";
    }
    //    重定向中文乱码解决
    @RequestMapping("v02")
    public String v02(RedirectAttributes attr){
        attr.addAttribute("uname","纪然");
        attr.addAttribute("id","1");
        return "redirect:v02.jsp";
    }
//    返回modelandview
    @RequestMapping("v03")
    public ModelAndView v03(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("uname","纪然");
        mv.addObject("id","20");
        mv.setViewName("redirect:v02.jsp");
        return mv;
    }
//    重定向到controller

    @RequestMapping("v04")
    public ModelAndView v04(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("uname","admin");
        mv.addObject("id","1");
        mv.setViewName("redirect:/user/queryUserByUserId.do");
        return mv;
    }

//    转发

    @RequestMapping("/v05")
    public ModelAndView v05(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("hello","hello v05");
        mv.setViewName("forward:user/test.do");
        return mv;
    }


}
