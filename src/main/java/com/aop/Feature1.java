package com.aop;

import org.springframework.stereotype.Service;

@Service
public class Feature1 implements LogPoint {

    public void log(){
        System.out.println("f1 run");
    }

    public void throwLog() {
    }

    public void around() {
        System.out.println("around");
    }
}
