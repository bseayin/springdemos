package com.zz.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

@RestController
public class UploadControler3 {
    @Value("${fileUpLoadPath}")
    String filePath;
    @RequestMapping(value="/testUpload3",method=RequestMethod.POST)
    public void testUploadFile(HttpServletRequest req,MultipartHttpServletRequest multiReq) throws IOException{
        MultipartFile multipartFile= multiReq.getFile("file");
        String filename=multipartFile.getOriginalFilename();
        System.out.println("文件名字："+multipartFile.getOriginalFilename());
        File file=new File(filePath+filename);
        multipartFile.transferTo(file);
    }
}
