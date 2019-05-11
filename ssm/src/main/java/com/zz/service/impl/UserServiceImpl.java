package com.zz.service.impl;


import ch.qos.logback.core.util.FileUtil;
import com.zz.dao.UserMapper;
import com.zz.entity.User;
import com.zz.service.UserService;
//import com.zz.util.FileUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public User selectByNameAndPwd(User user) {
        return userMapper.selectByNameAndPwd(user);
    }

    @Override
    public List<User> selectByName(String aa) {
        return userMapper.selectByName(aa);
    }

    @Override
    public List<User> selectBySexAge(Integer bb, String aa) {
        return userMapper.selectBySexAge(aa,bb);
    }

    @Override
    public List<User> selectByName2(String aa) {
//        FileUtil fileUtil=new FileUtil();
//        System.out.println(fileUtil.readFileToString("C:\\bsea\\wiki.txt"));
        return userMapper.selectByName2(aa);
    }
}
