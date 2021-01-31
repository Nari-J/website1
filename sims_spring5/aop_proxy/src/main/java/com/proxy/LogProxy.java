package com.proxy;


import com.annotations.Log;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class LogProxy {
//    @Pointcut("@annotation(com.annotations.Log)")
//    public void cut(){}

    @Around(value = "@annotation(com.annotations.Log) && @annotation(log)")
    public Object around(ProceedingJoinPoint pjp,Log log) throws Throwable {

        System.out.println(log.module()+","+log.desc());
        Object result=pjp.proceed();
        return result;

    }






}
