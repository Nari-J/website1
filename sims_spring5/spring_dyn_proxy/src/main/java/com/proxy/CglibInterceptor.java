package com.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CglibInterceptor implements MethodInterceptor {
//    拦截父类
    private Object target;

    public CglibInterceptor(Object target) {
        this.target = target;
    }
    public Object getProxy(){
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
//        返回代理对象
        return enhancer.create();
    }
    public void before(){
        System.out.println("支付开始时间---->"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
    }
    public void after(){
        System.out.println("支付结束时间---->"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        before();
        //        调用目标对象方法
        Object result=methodProxy.invoke(target,objects);
        after();

        return result;
    }
}
