package com.springboot.dao;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
	public User findByUserName(String userName);
	public  void add(User user);
	@Select("select * from t_user")
    public List<User> getAll();
}
