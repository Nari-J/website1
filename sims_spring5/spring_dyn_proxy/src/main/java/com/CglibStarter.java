package com;

import com.pay.Pay;
import com.pay.RmbPay;
import com.proxy.CglibInterceptor;

public class CglibStarter {
    public static void main(String[] args) {
//        创建目标对象

        RmbPay rmbPay=new RmbPay();
        CglibInterceptor cglibInterceptor=new CglibInterceptor(rmbPay);
        Pay rmbProxy= (Pay) cglibInterceptor.getProxy();
        rmbProxy.pay();



    }

}
