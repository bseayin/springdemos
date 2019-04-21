package com.zz.dao;

import com.zz.entity.Star;

public interface StarMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Star record);

    int insertSelective(Star record);

    Star selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Star record);

    int updateByPrimaryKey(Star record);
}