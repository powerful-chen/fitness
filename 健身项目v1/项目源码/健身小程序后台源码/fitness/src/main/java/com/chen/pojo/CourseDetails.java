package com.chen.pojo;

import lombok.Data;

/**
 * @ClassName CourseDetails
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/19 16:17
 */
//课程详情表
@Data
public class CourseDetails {
    private Integer courseContentId;
    private Integer courseSubId;
    private String imageName;
    private String step;
    private String breathe;
    private String feel;
    private String fault;
    private String tip;
    private String title;//标题
}
