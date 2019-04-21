package com.zz.util.staticProxy;

public class MoveStar extends  Star{
    //@Override 重写-父子直接，
    // 方法名字，参数列表，返回类型全部一样
    public void sing() {
        System.out.println("在电影里面唱歌");
    }
}
