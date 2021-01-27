package com.dao;

import com.po.User;

public interface IUserDao {
   User queryUserByUserName(String userName);
}
