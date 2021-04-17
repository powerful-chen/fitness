package com.chen.mapper;

import com.chen.pojo.Course;
import com.chen.pojo.CourseDetails;
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
public interface CourseDetailsMapper {

    List<CourseDetails> getCourseDetailsById(@Param("courseSubId") Integer id);

    //查询所有课程
    List<CourseDetails> getCourseDetails();

    //分页查询
    List<CourseDetails> getCourseDetailsByLimit(Integer page, Integer limit);

    //统计记录数
    int countNums();

    //添加课程课程详情
    int addCourseDetails(CourseDetails courseDetails);

    //修改课程课程详情
    int updateCourseDetails(CourseDetails courseDetails);

    //删除课程课程详情
    int deleteCourseDetails(@Param("courseContentId") Integer id);

}
