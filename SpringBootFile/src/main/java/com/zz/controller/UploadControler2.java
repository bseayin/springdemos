package com.zz.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.*;

import javax.servlet.http.HttpServletRequest;
@RestController
public class UploadControler2 {
    @Value("${fileUpLoadPath}")
    String filePath;
    @RequestMapping(value="/testUpload",method=RequestMethod.POST)
    public void testUploadFile(HttpServletRequest req,MultipartHttpServletRequest multiReq) throws IOException{

        FileInputStream fs=(FileInputStream) multiReq.getFile("file").getInputStream();
        MultipartFile multipartFile= multiReq.getFile("file");
        String filename=multipartFile.getOriginalFilename();
        System.out.println("文件名字："+multipartFile.getOriginalFilename());
        FileOutputStream fos=new FileOutputStream(new File(filePath+filename));
        byte[] buffer=new byte[1024];
        int len=0;
        while((len=fs.read(buffer))!=-1){
            fos.write(buffer, 0, len);
        }
        fos.close();
        fs.close();
    }
}
