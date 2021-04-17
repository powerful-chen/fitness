package com.chen.controller;

import com.chen.pojo.CourseDetails;
import com.chen.service.CourseDetailsService;
import com.chen.vo.CourseDetailsVo;
import com.chen.vo.DataVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName CourseController
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/12 19:28
 */
@RestController
@RequestMapping("/courseDetails")
public class CourseDetailsController {

    @Autowired
    private CourseDetailsService courseDetailsService;

    @RequestMapping("/getCourseDetailsById")
    public List<CourseDetails> getCourseDetailsById(Integer id) {
        return courseDetailsService.getCourseDetailsById(id);
    }

    @RequestMapping("/list")
    public List<CourseDetails> getCourseDetails() {
        return courseDetailsService.getCourseDetails();
    }

    @RequestMapping("/limit")
    public DataVo getCourseDetailsByLimit(Integer page, Integer limit) {
        return courseDetailsService.getCourseDetailsByLimit(page, limit);
    }

    @RequestMapping("/add")
    public CourseDetailsVo addCourseDetails(CourseDetails courseDetails) {
        return courseDetailsService.addCourseDetails(courseDetails);
    }

    @RequestMapping("/edit")
    public CourseDetailsVo updateCourseDetails(CourseDetails courseDetails) {
        return courseDetailsService.updateCourseDetails(courseDetails);
    }

    @RequestMapping("/delete")
    public CourseDetailsVo deleteDetails(Integer id) {
        return courseDetailsService.deleteDetails(id);
    }

    @RequestMapping("/batchDelete")
    public CourseDetailsVo batchDelete(String ids) {
        return courseDetailsService.batchDelete(ids);
    }


}
