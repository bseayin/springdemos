package com.zz.controller;

import com.zz.repository.UserStarRepository;
import com.zz.service.UserStarService;
import com.zz.util.ObjectConvertUtil;
import com.zz.vo.SelectResultVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class StarController {
    @Resource
    UserStarService userStarService;
    @RequestMapping("showSelect")
    public List<SelectResultVo> getSelectData() throws Exception {

        return ObjectConvertUtil.castEntity(userStarService.getSelectData(),SelectResultVo.class);
    }
}
