package com.dao.impl;

import com.dao.IUserDao;
import com.po.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

//用户数据库（未连接数据库，用set模拟）
@Repository
public class UserDaoImpl implements IUserDao {
    private Map<String,User> users;

    public UserDaoImpl() {
        users=new HashMap<>();
        users.put("admin",new User(1,"admin","123456"));
        users.put("jiran",new User(2,"jiran","12345678"));

    }

    @Override
    public User queryUserByUserName(String userName) {
        return users.get(userName);
    }
}
