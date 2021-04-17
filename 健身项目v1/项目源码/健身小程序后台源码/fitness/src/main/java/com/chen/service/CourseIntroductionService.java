package com.chen.service;

import com.chen.pojo.CourseIntroduction;
import com.chen.vo.CourseIntroductionVo;
import com.chen.vo.DataVo;

import java.util.List;

/**
 * @ClassName CourseSectionService
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/11 12:38
 */
public interface CourseIntroductionService {

    List<CourseIntroduction> getCourseIntroductionById(Integer id);

    List<CourseIntroduction> getCourseIntroduction();

    DataVo<CourseIntroduction> getCourseIntroductionByLimit(Integer page, Integer limit);

    CourseIntroductionVo addCourseIntroduction(CourseIntroduction courseIntroduction);

    CourseIntroductionVo updateCourseIntroduction(CourseIntroduction courseIntroduction);

    CourseIntroductionVo deleteCourseIntroduction(Integer id);

    CourseIntroductionVo batchDelete(String ids);
}
