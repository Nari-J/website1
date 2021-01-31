package com.pay;


import org.springframework.stereotype.Component;

@Component
public class DollarPay implements Pay{
    @Override
    public void pay() {
        System.out.println("美元支付...");
    }
}
