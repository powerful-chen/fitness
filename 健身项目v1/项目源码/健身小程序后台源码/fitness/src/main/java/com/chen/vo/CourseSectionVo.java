package com.chen.vo;

import com.chen.pojo.CourseSection;
import lombok.Data;

/**
 * @ClassName CourseSectionVo
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/11 10:39
 */
//课程栏目视图层
@Data
public class CourseSectionVo extends CourseSection {
    private boolean success;
    private String message;
}
