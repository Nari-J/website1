package com.dao.impl;
import com.dao.IUserDao;
import com.po.User;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import javax.annotation.Resource;

@SpringJUnitConfig(locations = {"classpath:spring.xml"})
class UserDaoImplTest {
    @Resource
    private IUserDao userDaoImpl;

    @Test
    void test01(){
        User user=new User();
        user.setUserName("test01");
        user.setUserPwd("123456");
        System.out.println(userDaoImpl.save(user));
    }
    @Test
    void test02(){
        User user=new User();
        user.setUserName("test02");
        user.setUserPwd("123456");
        System.out.println(userDaoImpl.saveHasKey(user));
    }
    @Test
    void test03(){
        User user=new User();
        user.setUserName("test02");
        user.setUserPwd("123");
        user.setId(4);
        System.out.println(userDaoImpl.update(user));
    }

    @Test
    void test04(){
        System.out.println(userDaoImpl.del(4));
    }
    @Test
    void countUser(){
        System.out.println(userDaoImpl.countUser());
    }
    @Test
    void queryUsers(){
        userDaoImpl.queryUsers().forEach(u->{
            System.out.println(u.getId()+"\t"+u.getUserName()+"\t"+u.getUserPwd());
        });
    }
    @Test
    void queryById(){
        User user=userDaoImpl.queryById(1);
        System.out.println(user.getId()+"\t"+user.getUserName()+"\t"+user.getUserPwd()+"\t");
    }

}