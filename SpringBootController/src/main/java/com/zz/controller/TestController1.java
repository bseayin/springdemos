package com.zz.controller;
import com.sun.net.httpserver.Authenticator;

import com.zz.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.omg.PortableInterceptor.SUCCESSFUL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @Description: java类作用描述
 * @Author: Bsea
 * @CreateDate: 2019/5/24$ 20:38$
 */
@RestController
public class TestController1 {
    //地址传值
    @RequestMapping("aa/{id}")
    public String aa(@PathVariable("id") String id) {
        System.out.println("----------"+id);
        return "----------"+id;
    }
    //？传值
    @RequestMapping("/bb")
    public String bb(@RequestParam String name){
        System.out.println("----------"+name);
        return "---------------"+name;
    }
    //body
    @PostMapping("/cc")
    public String cc(@RequestBody User user){
        return "----------名字："+user.getName()+"---------密码："+user.getPwd();
    }
    //form
    @PostMapping("/dd")
    public String dd(User user){
        return "----------"+user;
    }
    //Cookie
    @GetMapping("/ee")
    public String ee(@RequestHeader(name="myHeader") String myHeader,@CookieValue(name="myCookie") String myCookie){
        System.out.println("myHeader=" + myHeader);
        System.out.println("myCookie=" + myCookie);
        return "---------"+myHeader+"============="+myCookie;
    }



    //ModelAttribute
    @PostMapping("/ff")
    public User ff(@ModelAttribute("name") User name){
        //    System.out.println("------------"+test.getName());
        return name;
    }
}
