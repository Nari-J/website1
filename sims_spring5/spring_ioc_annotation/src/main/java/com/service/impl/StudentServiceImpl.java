package com.service.impl;

import com.dao.IStudentDao;
import com.service.IOrderService;
import com.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImpl implements IStudentService {
//autowired自动装配
//    多用于字段声明
//    注入（装配）规则：默认按照属性值的class类型
//    如果一个接口有两个class实现则不可自动装配
    @Autowired
    private IStudentDao studentDao;
    private IOrderService orderServic;
//    @Autowired
//    public StudentServiceImpl(IOrderService orderServic) {
//        this.orderServic = orderServic;
//    }

    @Autowired
    public void setOrderServic(IOrderService orderServic) {
        this.orderServic = orderServic;
    }

    public IStudentDao getStudentDao() {
        return studentDao;
    }

    public IOrderService getOrderServic() {
        return orderServic;
    }
}
