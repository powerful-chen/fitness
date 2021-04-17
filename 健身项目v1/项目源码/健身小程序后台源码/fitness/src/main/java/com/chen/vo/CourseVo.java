package com.chen.vo;

import com.chen.pojo.Course;
import lombok.Data;

/**
 * @ClassName CourseVo
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/13 8:06
 */
@Data
public class CourseVo extends Course {
    private boolean success;
    private String message;
}
