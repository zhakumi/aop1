package com.aop;

import org.springframework.stereotype.Service;

@Service
public class Feature3 implements LogPoint {
    public void log(){
        System.out.println("f3 run");
    }

    public void throwLog()  throws Exception  {
       throw new Exception("AAAA");
    }

    public void around() {
        System.out.println("around3");
    }
}
