package com;

import com.config.SpringConfig;
import com.service.impl.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter {
    public static void main(String[] args) {
        ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfig.class);

//        StudentServiceImpl studentService = (StudentServiceImpl) ac.getBean("studentServiceImpl");
//        System.out.println(studentService);
        StudentServiceImpl bean =ac.getBean(StudentServiceImpl.class);
        System.out.println(bean);

        SpringConfig springConfig=ac.getBean(SpringConfig.class);
        System.out.println(springConfig.dataSource());


    }
}
