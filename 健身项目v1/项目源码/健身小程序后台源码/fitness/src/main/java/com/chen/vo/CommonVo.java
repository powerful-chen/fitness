package com.chen.vo;

import lombok.Data;

/**
 * @ClassName CommonVo
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/9 23:20
 */
@Data
public class CommonVo<T> {
    private boolean success;
    private String message;
    private T data;
}
