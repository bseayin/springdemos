package com.zz.controller;

import com.zz.entity.Computer;
import com.zz.service.ComputerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
public class ComputerController {
    @Resource
    ComputerService computerService;

    @GetMapping("/get/{id}")
    public Computer getComputer(@PathVariable("id") Long id) {
        System.out.println("*******getComputer***" + id);
        return computerService.selectByPrimaryKey(id);
    }
    @GetMapping("/del/{id}")
    public int delComputer(@PathVariable("id") Long id) {
        System.out.println("*******delComputer***" + id);
        return computerService.deleteByPrimaryKey(id);
    }

    @GetMapping("/update/{id}/{name}")
    public Computer updateComputer(@PathVariable("id") Long id, @PathVariable("name") String name) {
        System.out.println("*******getComputer***" + id);
        Computer computer = new Computer();
        computer.setId(id);
        computer.setName(name);
        return computerService.updateByPrimaryKeySelective(computer);
    }
    @PostMapping("/updatecomputer")
    public Computer updateComputer2(Computer computer) {
        System.out.println("*******getComputer***" + computer.getName());
        return computerService.updateByPrimaryKeySelective(computer);
    }
}
