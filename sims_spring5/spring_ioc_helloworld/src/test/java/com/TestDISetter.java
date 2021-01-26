package com;

import com.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

public class TestDISetter {
    @Test
    public void test01(){
        BeanFactory factory=new ClassPathXmlApplicationContext("resources/bean-di-setter.xml");
        StudentServiceImpl studentService= (StudentServiceImpl) factory.getBean("studentService");
        assertNotNull(studentService);
        assertNotNull(studentService.getStudentDao());
        assertNotNull(studentService.getOrderService());
        System.out.println(studentService.getStudentName() + ',' + studentService.getStudentGrade());
    }
    @Test
    public void test02(){
        BeanFactory factory=new ClassPathXmlApplicationContext("resources/bean-di-setter.xml");
     
        StudentServiceImpl studentService= (StudentServiceImpl) factory.getBean("studentService");
        studentService.getCatg().forEach(c->{
            System.out.println(c);
        });

    }
    @Test
    public void test03(){
        BeanFactory factory=new ClassPathXmlApplicationContext("resources/bean-di-setter.xml");
        StudentServiceImpl studentService= (StudentServiceImpl) factory.getBean("studentService");
        studentService.getMap().forEach((k,v)->{
            System.out.println(k+","+v);
        });

    }
}
