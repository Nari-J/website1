package com;

import com.pay.Pay;
import com.pay.RmbPay;
import com.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {

    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring-aop-01.xml");
//        Pay pay= (Pay) ac.getBean("rmbPay");
//        pay.pay();

        StudentService studentService= (StudentService) ac.getBean("studentService");
        studentService.info();

    }
}
