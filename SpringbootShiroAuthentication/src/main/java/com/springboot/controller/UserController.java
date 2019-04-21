package com.springboot.controller;

import com.springboot.dao.UserMapper;
import com.springboot.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    UserMapper userMapper;
    @GetMapping("showall")
    public List<User> getAll(){
        return  userMapper.getAll();
    }
}
