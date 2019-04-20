package com.springboot.dao;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.pojo.User;

@Mapper
public interface UserMapper {
	public User findByUserName(String userName);
	public  void add(User user);
}
