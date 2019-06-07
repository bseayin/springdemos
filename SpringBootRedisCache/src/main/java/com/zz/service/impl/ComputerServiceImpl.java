package com.zz.service.impl;

import com.zz.entity.Computer;
import com.zz.mapper.ComputerMapper;
import com.zz.service.ComputerService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@CacheConfig(cacheNames = "computer")
public class ComputerServiceImpl implements ComputerService {
   @Resource
    ComputerMapper computerMapper;
    @Override
    @CacheEvict(key = "#p0.toString()", allEntries = true)
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
    @Cacheable(key = "#p0.toString()")
    public Computer selectByPrimaryKey(Long id) {
        return computerMapper.selectByPrimaryKey(id);
    }

    @Override
    @CachePut(key = "#p0.id.toString()")
    public Computer updateByPrimaryKeySelective(Computer record) {
        computerMapper.updateByPrimaryKeySelective(record);
        return computerMapper.selectByPrimaryKey(record.getId());
    }

    @Override
    public int updateByPrimaryKey(Computer record) {
        return 0;
    }
}
