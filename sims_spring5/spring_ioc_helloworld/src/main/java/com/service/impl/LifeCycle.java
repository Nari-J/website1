package com.service.impl;

public class LifeCycle {

    private String uname;

    public LifeCycle() {
        System.out.println("生命周期阶段1：实例化...");
    }

    public void setUname(String uname) {
        this.uname = uname;
        System.out.println("阶段2：对象属性赋值...");
    }
    private void init(){
        System.out.println("阶段3：对象初始化...");
    }
    private void destory(){
        System.out.println("阶段5：对象的销毁...");

    }
}
