package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LogXml {
    public void printLog()
    {
        System.out.println("log" + System.currentTimeMillis());
    }

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("application.xml");
        LogPoint logPoint1 = (LogPoint) ctx.getBean("feature1");
        logPoint1.log();
    }
}
