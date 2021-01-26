package com;

import com.service.impl.OrderServiceImpl2;
import com.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.junit.Assert.assertNotNull;

public class TestDIConstructor {
    @Test
    public void test01(){
        BeanFactory factory =new ClassPathXmlApplicationContext("bean-di-constructor.xml");
        OrderServiceImpl2 orderServiceImpl2= (OrderServiceImpl2) factory.getBean("orderService2");
        assertNotNull(orderServiceImpl2);
        assertNotNull(orderServiceImpl2.getStudentDao());
        System.out.println(orderServiceImpl2.getOrderNO());
        System.out.println(orderServiceImpl2.getPrice());


    }
    @Test
    public void test02(){
        BeanFactory factory =new ClassPathXmlApplicationContext("bean-di-constructor-cycle.xml");
    }
}
