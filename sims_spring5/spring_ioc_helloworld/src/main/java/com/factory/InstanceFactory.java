package com.factory;

import com.service.IOrderService;
import com.service.impl.OrderServiceImpl;

public class InstanceFactory {

    private static IOrderService orderService=new OrderServiceImpl();

    public IOrderService createInstance(){
        return orderService;
    }
}
