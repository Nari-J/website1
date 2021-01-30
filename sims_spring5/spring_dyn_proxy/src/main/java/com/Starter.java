package com;

import com.pay.Pay;
import com.pay.RmbPay;
import com.proxy.JdkHandler;

public class Starter {
    public static void main(String[] args) {
//        创建目标对象
        RmbPay rmbPay=new RmbPay();
        rmbPay.pay();

//        获取代理对象
        JdkHandler jdkHandler=new JdkHandler(rmbPay);

//        代理对象通过父对象接受
//        jdk 动态代理要求 目标对象必须在接口实现
//                jdk 产生的代理对象.类型不能与目标对象类型转换
        Pay rmbProxy= (Pay) jdkHandler.getProxy();
        rmbProxy.pay();;

    }
}
