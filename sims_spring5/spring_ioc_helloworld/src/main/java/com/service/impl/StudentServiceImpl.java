package com.service.impl;

import com.dao.IStudentDao;
import com.service.IOrderService;
import service.IStudentService;

import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements IStudentService {
    private IStudentDao studentDao;
    private IOrderService orderService;
    private String studentName;
    private int studentGrade;
    private List<String> catg;
    private Map<String,String> map;

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
    public Map<String, String> getMap() {
        return map;
    }

    public void setCatg(List<String> catg) {
        this.catg = catg;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public void setStudentDao(IStudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void setOrderService(IOrderService orderService) {
        this.orderService = orderService;
    }



    public IStudentDao getStudentDao() {
        return studentDao;
    }

    public IOrderService getOrderService() {
        return orderService;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public List<String> getCatg() {
        return catg;
    }
}
