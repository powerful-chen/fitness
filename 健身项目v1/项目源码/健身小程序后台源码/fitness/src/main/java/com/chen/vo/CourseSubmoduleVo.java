package com.chen.vo;

import com.chen.pojo.CourseSubmodule;
import lombok.Data;

/**
 * @ClassName CourseSubmoduleVo
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/19 11:01
 */
@Data
public class CourseSubmoduleVo extends CourseSubmodule {
    private boolean success;
    private String message;
}
