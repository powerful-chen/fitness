package com.chen.vo;

import com.chen.pojo.CourseSection;
import lombok.Data;

import java.util.List;

/**
 * @ClassName WxResultVo
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/4/7 15:35
 */
@Data
public class WxResultVo {
    private Integer sectionId;
    private String sectionName;
    private List<CourseSection> children;
}
