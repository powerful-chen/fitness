package com.chen.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

import javax.servlet.MultipartConfigElement;

/**
 * @ClassName UploadFileConfig
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/15 8:47
 */
//配置上传的文件路径
@Configuration
public class UploadFileConfig {
    @Value("${file.uploadFolder}")
    private String uploadFolder;

    @Bean
    MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setLocation(uploadFolder);
        long bytes = 5;
        //文件最大
        factory.setMaxFileSize(DataSize.ofMegabytes(bytes));
        // 设置总上传数据总大小
        factory.setMaxRequestSize(DataSize.ofMegabytes(bytes));
        return factory.createMultipartConfig();
    }
}
