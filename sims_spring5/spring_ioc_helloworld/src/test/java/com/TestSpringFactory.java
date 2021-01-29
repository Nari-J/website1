package com;

import com.service.IOrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

public class TestSpringFactory {
//    静态工厂测试
    @Test
    public void test01(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("factory.xml");
        IOrderService orderService= (IOrderService) ac.getBean("orderService");
        assertNotNull(orderService);
        System.out.println(orderService);
        System.out.println(ac.isPrototype("orderService"));
    }

//    实例化工厂测试
    @Test
    public void test02(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("instanceFactory.xml");
        IOrderService orderService= (IOrderService) ac.getBean("orderService");
        assertNotNull(orderService);
        System.out.println(orderService);
        System.out.println(ac.getBean("orderService"));
//        单例（两次打印地址相同）

    }
}
