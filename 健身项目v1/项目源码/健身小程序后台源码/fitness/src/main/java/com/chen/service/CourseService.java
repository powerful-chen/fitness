package com.chen.service;

import com.chen.pojo.Course;
import com.chen.vo.CourseVo;
import com.chen.vo.DataVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName CourseService
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/12 19:26
 */
public interface CourseService {

    List<Course> getCoursesById(Integer id);

    List<Course> getCourses();

    DataVo<Course> getCourseByLimit(Integer page, Integer limit);

    CourseVo addCourse(Course course);

    CourseVo updateCourse(Course course);

    CourseVo deleteCourse(Integer id);

    CourseVo batchDelete(String ids);
}
