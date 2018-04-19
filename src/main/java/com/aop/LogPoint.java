package com.aop;


/**
 * 切点
 */
public interface LogPoint {
    public void log();
    public void throwLog() throws Exception;
    public void around();
}
