package com.controller;


import com.query.UserQuery;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//参数绑定
//基本类型(包装类型),string,Array,JavaBean,集合
//建议使用包装类型

@Controller
public class ParamsController {

    @RequestMapping("p01")
    public void p01(int age,boolean flag,double s){
        System.out.println("age:"+age+"  flag:"+flag+"  s:"+s);
    }
//    少参数将报错500

//    defaultValue默认值 name 别名
    @RequestMapping("p02")
    public void p02(@RequestParam(defaultValue = "1",name="a") int age,
                    @RequestParam(defaultValue = "0")boolean flag,
                    @RequestParam(defaultValue = "2000") double s){
        System.out.println("age:"+age+"  flag:"+flag+"  s:"+s);
    }

//    包装类型默认为null,少参数不报错
    @RequestMapping("p03")
    public void p03(Integer age,Double s){
        System.out.println("age:"+age+"  s:"+s);
    }


//    数组类型
//    localhost:8080/p04.do?ids=1&ids=2
    @RequestMapping("P04")
    public void p04(Integer[] ids){
        for(Integer id:ids){
            System.out.println("id-->"+id);
        }
    }

//    参数类型与javaBean属性名
//    map['xxx']=xxx
//    http://localhost:8080/p05.do?id=20&userName=jiran&nicks=a&nicks=b
    @RequestMapping("p05")
    public void p05(UserQuery userQuery){

        userQuery.getNicks().forEach(s->{
            System.out.println(s);
        });
        System.out.println(userQuery);
    }


}
