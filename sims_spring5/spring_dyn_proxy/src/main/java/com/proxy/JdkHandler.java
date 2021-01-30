package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JdkHandler implements InvocationHandler {

//    目标对象
    private Object target;

    public JdkHandler(Object target) {
        this.target = target;
    }

    public Object getProxy(){
//        三个参数:
//        classLoder
//        目标对象实现的接口数组(Class[])
//        实现InvocationHandler接口的对象
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }


    public void before(){
        System.out.println("支付开始时间---->"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
    }
    public void after(){
        System.out.println("支付结束时间---->"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
    }



    //    产生动态代理对象最终调用目标对象方法

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();


//        调用目标对象方法
        Object result =method.invoke(target,args);

        after();
        return result;
    }
}
