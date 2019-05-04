package com.zz.entity;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//非静态的属性，就会自动生成get方法
@Getter
@Setter
// 重写toString方法
@ToString
//重写equals和hashcode方法， equals方法就比较所有属性值都相同就返回true
@EqualsAndHashCode
public class User {
    int age;
    String name;

}
