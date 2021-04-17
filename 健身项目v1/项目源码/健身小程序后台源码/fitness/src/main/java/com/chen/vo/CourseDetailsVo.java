package com.chen.vo;

import com.chen.pojo.CourseDetails;
import lombok.Data;

/**
 * @ClassName CourseDetailsVo
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/19 17:04
 */
@Data
public class CourseDetailsVo extends CourseDetails {
    private boolean success;
    private String message;
}
