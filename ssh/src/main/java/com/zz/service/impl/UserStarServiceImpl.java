package com.zz.service.impl;

import com.zz.repository.UserStarRepository;
import com.zz.service.UserStarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserStarServiceImpl implements UserStarService {
   @Resource
    UserStarRepository userStarRepository;
    @Override
    public List<Object[]> getSelectData() {
        return userStarRepository.getSelectData();
    }
}
