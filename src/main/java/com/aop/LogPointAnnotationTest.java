package com.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes=AopConfiguration.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class LogPointAnnotationTest {
    @Autowired
    private LogPoint feature3;
    @Autowired
    private LogPoint feature1;

    @Test
    public void log(){
        feature1.log();
    }

    @Test
    public void throwLog() throws Exception{
        feature1.throwLog();
    }
    @Test
    public void around(){
        feature3.around();
    }

}

