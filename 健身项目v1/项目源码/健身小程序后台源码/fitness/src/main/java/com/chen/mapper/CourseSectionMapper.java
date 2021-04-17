package com.chen.mapper;

import com.chen.pojo.CourseSection;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName CourseSectionMapper.xml
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/11 10:03
 */
@Mapper
@Repository
public interface CourseSectionMapper {

    List<CourseSection> getCourseSectionById(@Param("sectionId") Integer id);

    List<CourseSection> getCourseSection();

    //分页查询
    List<CourseSection> getCourseSectionByLimit(Integer page,Integer limit);

    //统计记录数
    int countNums();

    //添加课程栏目
    int addCourseSection(CourseSection courseSection);

    //修改课程栏目
    int updateCourseSection(CourseSection courseSection);

    //删除课程栏目
    int deleteCourseSection(@Param("courseSectionId") Integer id);

}
