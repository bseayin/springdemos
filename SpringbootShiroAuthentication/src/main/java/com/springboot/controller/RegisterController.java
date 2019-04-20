package com.springboot.controller;


import com.springboot.dao.UserMapper;
import com.springboot.pojo.User;
import com.springboot.util.MD5Utils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RegisterController {
    @Resource
    UserMapper userMapper;
    @PostMapping("reg")
    public Map register(String username, String password){
        User user=new User();
        password = MD5Utils.encrypt(username, password);
        user.setPassword(password);
        user.setUserName(username);

        Map map=new HashMap();
        System.out.println("register--"+user.getUserName());
        userMapper.add(user);
        map.put("status","success");
        return map;
    }
}
