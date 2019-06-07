package com.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author: Bsea
 * @CreateDate: 2019/6/7$ 20:15$
 */
@RestController
@Slf4j
public class TestController2 {
    @RequestMapping("/show2")
    public String t2(){
        log.debug("这个是debug-测试 基本的日志信息");
        log.info("这个是info-普通信息  基本的日志信息");
        log.warn("这个是warn-警告  基本的日志信息");
        log.error("这个是error--错误   基本的日志信息");
        return "tt";
    }
}
