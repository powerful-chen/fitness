package com.chen.service;

import com.chen.pojo.CourseSection;
import com.chen.vo.CourseSectionVo;
import com.chen.vo.DataVo;

import java.util.List;

/**
 * @ClassName CourseSectionService
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/11 12:38
 */
public interface CourseSectionService {

    List<CourseSection> getCourseSectionById(Integer id);

    List<CourseSection> getCourseSections();

    DataVo<CourseSection> getCourseSectionByLimit(Integer page, Integer limit);

    CourseSectionVo addCourseSection(CourseSection courseSection);

    CourseSectionVo updateCourseSection(CourseSection courseSection);

    CourseSectionVo deleteCourseSection(Integer id);

    CourseSectionVo batchDelete(String ids);
}
