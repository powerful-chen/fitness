package com.chen.controller;

import com.chen.pojo.CourseIntroduction;
import com.chen.service.CourseIntroductionService;
import com.chen.vo.CourseIntroductionVo;
import com.chen.vo.DataVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName CourseSectionController
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/11 13:02
 */
@RestController
@RequestMapping("/ci")
public class CourseIntroductionController {

    @Autowired
    private CourseIntroductionService courseIntroductionService;

    @RequestMapping("/getCourseIntroductionById")
    public List<CourseIntroduction> getCourseIntroductionById(Integer id) {
        return courseIntroductionService.getCourseIntroductionById(id);
    }

    @RequestMapping("/list")
    public List<CourseIntroduction> getCourseIntroduction() {
        return courseIntroductionService.getCourseIntroduction();
    }


    @RequestMapping("/limit")
    public DataVo<CourseIntroduction> getCourseIntroductionByLimit(Integer page, Integer limit) {
        return courseIntroductionService.getCourseIntroductionByLimit(page, limit);
    }

    @RequestMapping("/add")
    public CourseIntroductionVo addCourseIntroduction(CourseIntroduction courseIntroduction) {
        return courseIntroductionService.addCourseIntroduction(courseIntroduction);
    }

    @RequestMapping("/edit")
    public CourseIntroductionVo updateCourseIntroduction(CourseIntroduction courseIntroduction) {
        return courseIntroductionService.updateCourseIntroduction(courseIntroduction);
    }

    @RequestMapping("/delete")
    public CourseIntroductionVo deleteCourseIntroduction(Integer id) {
        return courseIntroductionService.deleteCourseIntroduction(id);
    }

    @RequestMapping("/batchDelete")
    public CourseIntroductionVo batchDelete(String ids) {
        return courseIntroductionService.batchDelete(ids);
    }
}
