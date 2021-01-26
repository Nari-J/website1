package com;
import com.controller.StudentController;
import com.dao.IStudentDao;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.junit.Assert.*;
public class TestSpringXml {
    @Test
    public void Test02(){
        BeanFactory factory=new ClassPathXmlApplicationContext("beans-all.xml");
        service.IStudentService studentService= (service.IStudentService) factory.getBean("studentService");
        assertNotNull(studentService);

        IStudentDao studentDao= (IStudentDao) factory.getBean("studentDao");
        assertNotNull(studentDao);
        StudentController studentController= (StudentController) factory.getBean("studentController");
        assertNotNull(studentController);


    }


}
