package com.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
//声明aop切面（切入点+通知）
@Component
@Aspect
public class LogAnnotationProxy {

//    声明切入点
//    修饰符 包.类.方法(形参)
    @Pointcut("execution(* com.pay.*.*(..))")
    public void cut(){}
//    增强
//    @Before(value="cut()")
//    public void before(){
//        System.out.println("前置通知：目标方法执行前...");
//    }
//    @After(value = "cut()")
//    public void after(){
//        System.out.println("后置（最终）通知：方法结束后...");
//    }
//    @AfterReturning(value = "cut()")
//    public void afterReturn(){
//        System.out.println("返回通知通知：方法正常结束后执行...");
//    }
//    @AfterThrowing(value = "cut()",throwing = "e")
//    public void afterThrow(Exception e){
//        System.out.println("异常通知：方法异常执行..."+e);
//    }



    @Around(value = "cut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知：前");

        System.out.println("pjp.getTarget()  "+pjp.getTarget());
        System.out.println("pjp.getSignature()  "+pjp.getSignature());
        System.out.println("pjp.getArgs()  "+pjp.getArgs());
        System.out.println("pjp.getThis()  "+pjp.getThis());
        System.out.println("pjp.getKind()  "+pjp.getKind());
//        执行目标对象方法
        Object result=pjp.proceed();


        System.out.println("环绕通知：后");
        return result;

    }









}
