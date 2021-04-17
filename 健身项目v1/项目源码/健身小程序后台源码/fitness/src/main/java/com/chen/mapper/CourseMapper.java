package com.chen.mapper;

import com.chen.pojo.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName CourseMapper
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/12 19:20
 */
@Mapper
@Repository
public interface CourseMapper {

    List<Course> getCoursesById(@Param("courseSectionId") Integer id);

    //查询所有课程
    List<Course> getCourses();

    //分页查询
    List<Course> getCourseByLimit(Integer page, Integer limit);

    //统计记录数
    int countNums();

    //添加课程栏目
    int addCourse(Course course);

    //修改课程栏目
    int updateCourse(Course course);

    //删除课程栏目
    int deleteCourse(@Param("courseId") Integer id);

}
