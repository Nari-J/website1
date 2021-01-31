package com.pay;


import org.springframework.stereotype.Component;

@Component

public class RmbPay implements Pay{
    @Override
    public void pay() {
//        int a=1/0;
        System.out.println("人民币支付...");
    }
}
