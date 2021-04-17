package com.chen.mapper;

import com.chen.pojo.CourseIntroduction;
import com.chen.pojo.CourseSection;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName CourseIntroduction.xml
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/11 10:03
 */
@Mapper
@Repository
public interface CourseIntroductionMapper {

    List<CourseIntroduction> getCourseIntroductionById(@Param("courseId") Integer id);

    List<CourseIntroduction> getCourseIntroduction();

    //分页查询
    List<CourseIntroduction> getCourseIntroductionByLimit(Integer page, Integer limit);

    //统计记录数
    int countNums();

    //添加课程栏目
    int addCourseIntroduction(CourseIntroduction courseIntroduction);

    //修改课程栏目
    int updateCourseIntroduction(CourseIntroduction courseIntroduction);

    //删除课程栏目
    int deleteCourseIntroduction(@Param("courseIntroId") Integer id);

}
