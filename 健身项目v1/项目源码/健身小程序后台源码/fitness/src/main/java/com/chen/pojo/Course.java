package com.chen.pojo;

import lombok.Data;

/**
 * @ClassName Course
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/11 23:25
 */
//课程
@Data
public class Course {
    private Integer courseId;
    private Integer courseSectionId;
    private String courseSectionName;
    private String calories;
    private String intensity;
    private String times;
    private String trainingFrequency;
    private String backgroundImageName;
}
