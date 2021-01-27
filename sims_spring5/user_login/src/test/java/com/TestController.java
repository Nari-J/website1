package com;

import com.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestController {
    @Test
    public void test01(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        UserController userController= (UserController) ac.getBean("userController");
        System.out.println(userController.login("admin", "123456"));
    }


}
