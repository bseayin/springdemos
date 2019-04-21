package com.zz.dao;

import com.zz.entity.UserStar;
import com.zz.vo.SelectResultVo;

import java.util.List;

public interface UserStarMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserStar record);

    int insertSelective(UserStar record);

    UserStar selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserStar record);

    int updateByPrimaryKey(UserStar record);
    List<SelectResultVo> selectVo();
}