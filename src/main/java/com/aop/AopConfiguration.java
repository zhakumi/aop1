package com.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AopConfiguration {
    @Bean
    public LogAspectJ logAspectJ(){
        return  new  LogAspectJ();
    }
}
