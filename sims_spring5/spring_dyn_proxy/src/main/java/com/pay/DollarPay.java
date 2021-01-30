package com.pay;

public class DollarPay implements Pay{

    @Override
    public void pay() {
        System.out.println("美元支付...");
    }
}
