package com.zz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author: Bsea
 * @CreateDate: 2019/5/24$ 20:34$
 */
@RestController
public class TestController {

    @RequestMapping("test1")
    public String t1(){
        return "hello SpringBoot";
    }
}
