package com.zz.controller;

import com.zz.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * @description:contorller
 * @author: duzi55
 * @date: 2019-05-24 13:51
 */
@RestController
@RequestMapping("test")
public class TestController2 {
    @RequestMapping("test1")
    public String test(){
        return "你好";
    }
    //地址传值
    @RequestMapping("request1/{id}")
    public String test1(@PathVariable("id") int id){
        return "id是："+id;
    }
    //? 传值
    @RequestMapping("request2")
    public String test2(@RequestParam(value = "name")String name){
        return "名字是："+name;
    }
    //Body参数
    @RequestMapping("request3")
    public User test3(@RequestBody  User user){
        return user;
    }
    //无注解（form提交
    @RequestMapping("request4")
    public User test4(User user){
        return user;
    }
    //请求头参数以及Cookie
    @RequestMapping("request5")
    public String test5(@RequestHeader(name ="Header") String Header,
                        @CookieValue(name ="cookie1") String cookie1,
                        @CookieValue(name ="cookie2") String cookie2){
        return "Header:"+Header+"cookie1:"+cookie1+"cookie2"+cookie2;
    }
    //表单的参数写在Controller相应的方法的形参中
    @RequestMapping("request6")
    public User test6(String name, String pwd){
        User user=new User();
        user.setName(name);
        user.setPwd(pwd);
        return user;
    }
    //@ModelAttribute注解获取POST请求的FORM表单数据
    @RequestMapping("request7")
    public User test7(@ModelAttribute("user")User user){
        return user;
    }
}
