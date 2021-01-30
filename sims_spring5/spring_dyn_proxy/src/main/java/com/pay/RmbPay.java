package com.pay;

public class RmbPay implements Pay{

    @Override
    public void pay() {
        System.out.println("人民币支付...");
    }
}
