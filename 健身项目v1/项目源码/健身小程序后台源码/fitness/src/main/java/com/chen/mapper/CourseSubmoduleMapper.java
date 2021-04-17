package com.chen.mapper;

import com.chen.pojo.CourseSubmodule;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName CourseSubmoduleMapper.xml
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/11 10:03
 */
@Mapper
@Repository
public interface CourseSubmoduleMapper {

    List<CourseSubmodule> getCourseSubmodulebyId(@Param("courseId") Integer id);

    List<CourseSubmodule> getCourseSubmodule();

    //分页查询
    List<CourseSubmodule> getCourseSubmoduleByLimit(Integer page, Integer limit);

    //统计记录数
    int countNums();

    //添加课程栏目
    int addCourseSubmodule(CourseSubmodule courseSubmodule);

    //修改课程栏目
    int updateCourseSubmodule(CourseSubmodule courseSubmodule);

    //删除课程栏目
    int deleteCourseSubmodule(@Param("courseSubId") Integer id);

}
