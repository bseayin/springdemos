package com.zz.controller;

import com.zz.entity.User;
import com.zz.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    UserService userService;
    @RequestMapping("show/{name}/{pwd}")
    public User getUser(@PathVariable("name") String name,@PathVariable("pwd") String pwd){
        User user=new User();
        user.setName(name);
        user.setPwd(pwd);
        return  userService.selectByNameAndPwd(user);
    }

    @RequestMapping("showname/{name}")
    public List<User> getUserByName(@PathVariable("name") String name){

        return  userService.selectByName2(name);
    }@RequestMapping("show1/{ttt}/{ccc}")
    public List<User> getUserByName(@PathVariable("ttt") String sex,@PathVariable("ccc") Integer age){


        return  userService.selectBySexAge(age,sex);
    }
}
