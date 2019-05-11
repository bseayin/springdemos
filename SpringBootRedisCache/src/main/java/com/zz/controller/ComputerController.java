package com.zz.controller;

import com.zz.entity.Computer;
import com.zz.service.ComputerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ComputerController {
    @Resource
    ComputerService computerService;
    @GetMapping("/get/{id}")
    public Computer getComputer(@PathVariable("id") Long id){
        System.out.println("*******getComputer***"+id);
        return  computerService.selectByPrimaryKey(id);
    }
}
