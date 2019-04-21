package com.zz.util.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
    Star star;

    public  DynamicProxy(Star s){
        this.star=s;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("这个地方是动态代理，执行目标类方法之前");
        Object rs=method.invoke(this.star,args);
        System.out.println("这个地方是动态代理，执行目标类方法之后");
        return rs;
    }
}
