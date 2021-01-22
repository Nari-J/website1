package com;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.junit.Assert.*;
public class TestSpringHelloWorld {
    @Test
    public void test01(){
        BeanFactory factory=new ClassPathXmlApplicationContext("beans.xml");
        service.IStudentService studentService= (service.IStudentService) factory.getBean("studentService");
//        studentService=null;
        assertNotNull(studentService);


    }
}
