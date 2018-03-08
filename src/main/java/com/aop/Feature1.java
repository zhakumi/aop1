package com.aop;

public class Feature1 implements Log {

    public void log(){
        System.out.println("f1");
    }

    public void throwLog() {
    }

    public void around() {
        System.out.println("around");
    }
}
