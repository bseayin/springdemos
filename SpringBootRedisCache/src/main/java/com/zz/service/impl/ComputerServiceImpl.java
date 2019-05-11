package com.zz.service.impl;

import com.zz.entity.Computer;
import com.zz.mapper.ComputerMapper;
import com.zz.service.ComputerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ComputerServiceImpl implements ComputerService {
   @Resource
    ComputerMapper computerMapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(Computer record) {
        return 0;
    }

    @Override
    public int insertSelective(Computer record) {
        return 0;
    }

    @Override
    public Computer selectByPrimaryKey(Long id) {
        return computerMapper.selectByPrimaryKey(id);
    }

    @Override
    public Computer updateByPrimaryKeySelective(Computer record) {
        computerMapper.updateByPrimaryKeySelective(record);
        return computerMapper.selectByPrimaryKey(record.getId());
    }

    @Override
    public int updateByPrimaryKey(Computer record) {
        return 0;
    }
}
