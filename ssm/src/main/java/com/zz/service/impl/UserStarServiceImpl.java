package com.zz.service.impl;

import com.zz.dao.UserStarMapper;
import com.zz.entity.User;
import com.zz.service.UserStarService;
import com.zz.vo.SelectResultVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserStarServiceImpl implements UserStarService {
   @Resource
   UserStarMapper userStarMapper;

    @Override
    public List<SelectResultVo> selectVo() {
        return userStarMapper.selectVo();
    }


}
