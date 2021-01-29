package com;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("beans-life-cycle.xml");
        System.out.println("阶段4：使用中..."+context);
        context.close();
    }
}
