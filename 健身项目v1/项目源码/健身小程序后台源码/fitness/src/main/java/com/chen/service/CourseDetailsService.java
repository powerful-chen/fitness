package com.chen.service;

import com.chen.pojo.CourseDetails;
import com.chen.pojo.CourseIntroduction;
import com.chen.vo.CourseDetailsVo;
import com.chen.vo.DataVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName CourseDetailsService
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/12 19:26
 */
public interface CourseDetailsService {

    List<CourseDetails> getCourseDetailsById(Integer id);

    List<CourseDetails> getCourseDetails();

    DataVo<CourseDetails> getCourseDetailsByLimit(Integer page, Integer limit);

    CourseDetailsVo addCourseDetails(CourseDetails courseDetails);

    CourseDetailsVo updateCourseDetails(CourseDetails courseDetails);

    CourseDetailsVo deleteDetails(Integer id);

    CourseDetailsVo batchDelete(String ids);
}
