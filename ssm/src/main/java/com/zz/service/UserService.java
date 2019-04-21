package com.zz.service;

import com.zz.entity.User;

import java.util.List;

public interface UserService {
    User selectByNameAndPwd(User record);
    List<User> selectByName(String aa);
    List<User> selectBySexAge(Integer bb,String aa);
    List<User> selectByName2(String aa);
}
