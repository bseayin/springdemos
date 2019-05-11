package com.zz.mapper;

import com.zz.entity.Computer;
import org.springframework.cache.annotation.CacheConfig;

@CacheConfig(cacheNames = "computer")
public interface ComputerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Computer record);

    int insertSelective(Computer record);

    Computer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Computer record);

    int updateByPrimaryKey(Computer record);
}