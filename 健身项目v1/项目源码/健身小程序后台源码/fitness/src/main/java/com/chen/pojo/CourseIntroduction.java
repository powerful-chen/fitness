package com.chen.pojo;

import lombok.Data;

/**
 * @ClassName CourseIntroduction
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/15 16:44
 */
//课程简要介绍
@Data
public class CourseIntroduction {
    private Integer courseIntroId;
    private Integer courseId;
    private String courseIntroDetail;
    private String courseIntroType;
    private String fitCrowd;
    private String tabooCrowd;
    private String prepare;
    private String physicalReaction;
    private String advice;
    private String courseName;
}
