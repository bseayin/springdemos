package com.zz.entity;

public class Test2 {
    public static void main(String[] args) {
        User2 user=new User2();
        user.getAge();
        user.setAge(11);
        user.setName("张三");
        //打印，默认是调用了user的toString()方法
        System.out.println(user);
        User2 user2=new User2();
        user2.setAge(11);
        user2.setName("张三");
        System.out.println(user.equals(user2));
    }
}
