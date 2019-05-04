package com.zz.entity;

public class Test {
    public static void main(String[] args) {
        User user=new User();
        user.getAge();
        user.setAge(11);
        user.setName("张三");
        //打印，默认是调用了user的toString()方法
        System.out.println(user);
        User user2=new User();
        user2.setAge(11);
        user2.setName("张三");
        System.out.println(user.equals(user2));
    }
}
