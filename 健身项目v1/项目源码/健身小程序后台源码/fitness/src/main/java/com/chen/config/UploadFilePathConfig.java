package com.chen.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName UploadFilePathConfig
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/15 9:07
 */
//设置虚拟路径，访问绝对路径下的资源
@Configuration
public class UploadFilePathConfig implements WebMvcConfigurer {

    @Value("${file.staticAccessPath}")
    private String staticAccessPath;
    @Value("${file.uploadFolder}")
    private String uploadFolder;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(staticAccessPath).addResourceLocations("file:" + uploadFolder);//这时就可以通过访问 http://localhost:8080/api/file/xxx.txt访问F://test//image//下的资源
    }
}
