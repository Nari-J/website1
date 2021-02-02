package com.dao;

import com.po.User;

import java.util.List;

public interface IUserDao {
    public Integer save(User user);
    public Integer saveHasKey(User user);
    public Integer update(User user);
    public Integer del(Integer id);


    public Integer countUser();
    public List<User> queryUsers();
    public User queryById(Integer id);


}
