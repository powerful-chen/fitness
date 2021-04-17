package com.chen.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @ClassName FileUtil
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/13 15:54
 */
public class FileUtil {

    //图片实际上传的路径
    public static final String IMAGE_LOCAL_PATH = "F://test//image//";

    //图片uri
    public static final String IMAGE_URI = "http://localhost:8080/api/file/";

    /**
     * 获取上次后的新的文件名
     *
     * @param file     封装操作文件方法
     * @param filePath 文件上传的本地的实际地址
     * @return 新的文件名称，用来存入数据库
     */
    public static String fileOperate(MultipartFile file, String filePath) {
        String originalFileName = file.getOriginalFilename();//获取原始图片的扩展名
        String newFileName = UUID.randomUUID() + originalFileName;  //新的文件名称
        File targetFile = new File(filePath, newFileName); //创建新文件
        try {
            //把本地文件上传到文件位置 , transferTo()是springmvc封装的方法，用于图片上传时，把内存中图片写入磁盘
            file.transferTo(targetFile);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newFileName;
    }
}
