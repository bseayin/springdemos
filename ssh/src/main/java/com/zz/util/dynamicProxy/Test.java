package com.zz.util.dynamicProxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Star star=new Star();
        DynamicProxy dynamicProxy=new DynamicProxy(star);
        ParentInterface parentInterface= (ParentInterface) Proxy.newProxyInstance(star.getClass().getClassLoader(),star.getClass().getInterfaces(),dynamicProxy);
        parentInterface.sing();
    }
}
