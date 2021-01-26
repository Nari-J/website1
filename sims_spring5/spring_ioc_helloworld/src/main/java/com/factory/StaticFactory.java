package com.factory;

import com.service.IOrderService;
import com.service.impl.OrderServiceImpl;

public class StaticFactory {

    private  static IOrderService orderService=new OrderServiceImpl();

    private StaticFactory(){}

    public static IOrderService createInstance(){
        return orderService;
    }

}
