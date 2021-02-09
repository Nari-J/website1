package com.controller;


import com.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

//json数据交互
@Controller
public class JsonController {



//    requestBody 级别 形参
//    作用 将客户端发送的请求体（json）转化为指定类型的java 对象
    @RequestMapping("json01")
    public void json01(@RequestBody User user){
        System.out.println(user);
    }




//    ResponseBody 响应注解 转化为json
//            级别 方法
    @RequestMapping("json02")
    @ResponseBody
    public String json02(){
        return "Spring json is so easy!";
    }
    @RequestMapping("json03")
    @ResponseBody
    public Map<String,String> json03(){
        Map<String,String> map=new HashMap<>();
        map.put("大计基","周四");
        map.put("大软基","周二");
        return map;
    }

}
