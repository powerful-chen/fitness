package com.chen.vo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName DataVo
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/6 15:48
 */
@Data
public class DataVo<T> {
    private Integer code;
    private String msg;
    private Integer count;
    private List<T> data;
}
