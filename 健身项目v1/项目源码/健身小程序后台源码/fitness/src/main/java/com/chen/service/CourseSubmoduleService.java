package com.chen.service;

import com.chen.pojo.CourseSubmodule;
import com.chen.vo.CourseSubmoduleVo;
import com.chen.vo.DataVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName CourseSectionService
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/11 12:38
 */
public interface CourseSubmoduleService {

    List<CourseSubmodule> getCourseSubmodulebyId(Integer id);

    List<CourseSubmodule> getCourseSubmodules();

    DataVo<CourseSubmodule> getCourseSubmoduleByLimit(Integer page, Integer limit);

    CourseSubmoduleVo addCourseSubmodule(CourseSubmodule courseSubmodule);

    CourseSubmoduleVo updateCourseSubmodule(CourseSubmodule courseSubmodule);

    CourseSubmoduleVo deleteCourseSubmodule(Integer id);

    CourseSubmoduleVo batchDelete(String ids);
}
