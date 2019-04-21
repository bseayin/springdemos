package com.zz.util.staticProxy;

public class Test {
    public static void main(String[] args) {
        Star star=new Star();
        Star moveStar=new MoveStar();
//        star.sing();//原来，目标类的sing方法就是唱歌。
        Proxy proxy=new Proxy(moveStar);
        //通过静态代理，我们不直接执行目标类的sing方法
        //而是通过执行代理类的sing方法类，执行目标类的sing()
        proxy.sing();
    }
}
