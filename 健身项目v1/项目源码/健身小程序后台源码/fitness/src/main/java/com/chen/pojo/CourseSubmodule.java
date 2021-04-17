package com.chen.pojo;

import lombok.Data;

/**
 * @ClassName CourseSubmodule
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/16 22:32
 */
//课程子模块
@Data
public class CourseSubmodule {
    private Integer courseSubId;
    private Integer courseId;
    private String thumbName;
    private String courseSubTitle;
    private String trainingTime;
    private String courseName;
}
