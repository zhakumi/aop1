package com.aop.theory;

import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Component
public class DogProxyDynamic implements InvocationHandler {

    private Object target;

    /**
     * 绑定接口
     *
     * @param target
     * @return
     */
    public Object bind(Object target) {
        this.target = target;
        //取得代理对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("事物开始");
        //执行方法
        result = method.invoke(target, args);
        System.out.println("事物结束");
        return result;
    }
}
