package com.service.impl;

import com.dao.IStudentDao;
import com.service.IOrderService2;
import service.IStudentService;

public class OrderServiceImpl2 implements IOrderService2 {

    private String OrderNO;
    private Double price;
    private IStudentDao studentDao;

    public OrderServiceImpl2(String orderNO, Double price, IStudentDao studentDao) {
        OrderNO = orderNO;
        this.price = price;
        this.studentDao = studentDao;
    }

    public IStudentDao getStudentDao() {
        return studentDao;
    }

    public String getOrderNO() {
        return OrderNO;
    }

    public Double getPrice() {
        return price;
    }
}
