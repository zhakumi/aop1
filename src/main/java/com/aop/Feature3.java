package com.aop;

import com.aop.Log;
import org.springframework.stereotype.Service;

@Service
public class Feature3 implements Log {
    public void log(){
        System.out.println("f3");
    }

    public void throwLog()  throws Exception  {
       throw new Exception("AAAA");
    }

    public void around() {
        System.out.println("around3");
    }
}
