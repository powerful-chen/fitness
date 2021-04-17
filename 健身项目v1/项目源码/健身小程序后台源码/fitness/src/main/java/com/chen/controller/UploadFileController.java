package com.chen.controller;

import com.chen.utils.FileUtil;
import com.chen.vo.UploadVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @ClassName UploadFileController
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/19 14:44
 */
//文件上传获取新的文件名
@RestController
public class UploadFileController {
    @RequestMapping("/imageName")
    public UploadVo<String> selectImageName(@RequestParam(value = "file") MultipartFile file){
        UploadVo<String> stringUploadVo = new UploadVo<>();
        try {
            String newFileName = FileUtil.fileOperate(file, FileUtil.IMAGE_LOCAL_PATH);
            stringUploadVo.setCode(0);
            stringUploadVo.setMsg("");
            stringUploadVo.setData(newFileName);
        }catch (Exception e){
            stringUploadVo.setCode(-1);
            stringUploadVo.setMsg("请求失败");
            e.printStackTrace();
        }
        return stringUploadVo;
    }
}
