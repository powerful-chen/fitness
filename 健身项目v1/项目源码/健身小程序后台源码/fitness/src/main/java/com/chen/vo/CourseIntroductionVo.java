package com.chen.vo;

import com.chen.pojo.CourseIntroduction;
import lombok.Data;

/**
 * @ClassName CourseIntroductionVo
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/15 19:32
 */
@Data
public class CourseIntroductionVo extends CourseIntroduction {
    private boolean success;
    private String message;
}
