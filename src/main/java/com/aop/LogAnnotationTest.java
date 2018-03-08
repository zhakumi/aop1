package com.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes=AopConfiguration.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class LogAnnotationTest {
    @Autowired
    private  Log feature3;

    @Test
    public void log(){
        feature3.log();
    }
    @Test
    public void throwLog() throws Exception{
        feature3.throwLog();
    }
    @Test
    public void around(){
        feature3.around();
    }


}

