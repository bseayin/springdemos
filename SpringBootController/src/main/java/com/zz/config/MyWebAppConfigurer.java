package com.zz.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * @Description: java类作用描述
 * @Author: Bsea
 * @CreateDate: 2019/5/24$ 21:54$
 */
@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {
    @Value("${imagesPath}")
    private String mImagesPath;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        if(mImagesPath.equals("") || mImagesPath.equals("${imagesPath}")){
//            String imagesPath = MyWebAppConfigurer.class.getClassLoader().getResource("").getPath();
//            if(imagesPath.indexOf(".jar")>0){
//                imagesPath = imagesPath.substring(0, imagesPath.indexOf(".jar"));
//            }else if(imagesPath.indexOf("classes")>0){
//                imagesPath = "file:"+imagesPath.substring(0, imagesPath.indexOf("classes"));
//            }
//            imagesPath = imagesPath.substring(0, imagesPath.lastIndexOf("/"))+"/images/";
//            mImagesPath = imagesPath;
//        }
        //LoggerFactory.getLogger(WebAppConfig.class).info("imagesPath="+mImagesPath);
        registry.addResourceHandler("/images/**").addResourceLocations(mImagesPath);
        // TODO Auto-generated method stub
        super.addResourceHandlers(registry);
    }
}
