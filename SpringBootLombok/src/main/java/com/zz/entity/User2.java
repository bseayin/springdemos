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
@EqualsAndHashCode
public class User2 {
    int age;
    String name;

}
