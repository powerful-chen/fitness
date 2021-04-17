package com.chen.pojo;

import lombok.Data;

/**
 * @ClassName CourseSection
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/11 8:52
 */
@Data
//课程栏目
public class CourseSection {
    private Integer courseSectionId;
    private Integer sectionId;
    private String courseSectionTip;
    private String courseSectionName;
    private String sectionName;
    private String backgroundImage;//从课程中获取背景图片
}
