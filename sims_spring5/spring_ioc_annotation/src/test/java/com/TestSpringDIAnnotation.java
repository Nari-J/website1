package com;

import com.service.impl.StudentServiceImpl;
import javafx.application.Application;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringDIAnnotation {
    @Test
    public void test01(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        StudentServiceImpl studentService= (StudentServiceImpl) ac.getBean("studentService");
        assertNotNull(studentService.getStudentDao());
        assertNotNull(studentService.getOrderServic());
    }
}
