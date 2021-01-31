package com.service;


import com.annotations.Log;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
    @Log(module="学生模块",desc="学生详情查看")
    public void info(){
        System.out.println("学生详情查看...");
    }
    @Log(module = "学生模块",desc = "学生列表")
    public void list(){
        System.out.println("学生列表...");
    }
}
