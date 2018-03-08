package com.aop;


/**
 * 切点
 */
public interface Log {
    public void log();
    public void throwLog() throws Exception;
    public void around();
}
