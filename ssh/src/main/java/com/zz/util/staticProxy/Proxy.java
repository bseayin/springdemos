package com.zz.util.staticProxy;

public class Proxy implements ParentInterface {
    //代理类，需要有一个成员变量，数据类型是目标类
    Star star;
    //代理类，有一个构造方法，输入参数是目标类的对象
    // 构造方法：1，方法的名字和类名一样，2，没有返回类型
    public Proxy(Star d){
        //把输入参数赋值给成员变量，进行初始化
        this.star=d;
    }
    @Override
    public void sing() {
        System.out.println("先喝酒");
        star.sing();
        System.out.println("跳个舞");
    }
}
