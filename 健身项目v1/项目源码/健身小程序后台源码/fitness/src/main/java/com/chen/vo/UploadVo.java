package com.chen.vo;

import lombok.Data;

/**
 * @ClassName UploadVo
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/13 15:40
 */
@Data
public class UploadVo<T> {
    private Integer code;
    private String msg;
    private T data;
}
