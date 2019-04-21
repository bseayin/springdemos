package com.zz.controller;


import com.zz.dao.StarMapper;
import com.zz.entity.Star;
import com.zz.service.UserStarService;
import com.zz.vo.SelectResultVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class StarController {
    @Resource
    UserStarService userStarService;
    @RequestMapping("showSelect")
    public List<SelectResultVo> getSelectData() throws Exception {

        return userStarService.selectVo();
    }
}
