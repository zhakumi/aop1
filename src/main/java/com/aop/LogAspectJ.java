package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 切面  @Aspect 表明LogAspectJ 不仅仅是一个pojo还是一个切面
 */
@Aspect
public class LogAspectJ {
    //定义切点
    @Pointcut("execution(* com.aop.Log.log(..))")
    public void log(){}
    @Pointcut("execution(* com.aop.Log.throwLog(..))")
    public void throwLog(){}
    @Pointcut("execution(* com.aop.Log.around(..))")
    public void around(){}

    /**
     * 前置
     */
    @Before("log()")
    public void befor(){
        System.out.println("befor");
    }

    /**
     * 后置
     */
    @After("log()")
    public void after(){
        System.out.println("after");
    }

    /**
     * 返回
     */
    @AfterReturning("log()")
    public void afterReturning(){
        System.out.println("returning");
    }

    /**
     * 异常
     */
    @AfterThrowing("throwLog()")
    public void afterThrowing(){
        System.out.println("throwing");
    }

    /**
     * 环绕
     * @param joinPoint
     */
    @Around("around()")
    public void around(ProceedingJoinPoint joinPoint){
        try{
            System.out.println("around after");
            joinPoint.proceed();
            System.out.println("around befor");
        }catch (Throwable e){
            System.out.println("exception");
        }

    }
}
