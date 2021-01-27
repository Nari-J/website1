package com.service;

import com.model.ResultModel;

public interface IUserService {
    public ResultModel login(String userName,String userPwd);
}
