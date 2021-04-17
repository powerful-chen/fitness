package com.chen.controller;

import com.chen.pojo.CourseSubmodule;
import com.chen.service.CourseSubmoduleService;
import com.chen.vo.CourseSubmoduleVo;
import com.chen.vo.DataVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName CourseSubmoduleController
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/19 11:17
 */
@RestController
@RequestMapping("/c_sub")
public class CourseSubmoduleController {

    @Autowired
    private CourseSubmoduleService courseSubmoduleService;

    @RequestMapping("/getCourseSubmodulebyId")
    public List<CourseSubmodule> getCourseSubmodulebyId(Integer id) {
        return courseSubmoduleService.getCourseSubmodulebyId(id);
    }

    @RequestMapping("/list")
    public List<CourseSubmodule> getCourseSubmodules() {
        return courseSubmoduleService.getCourseSubmodules();
    }


    @RequestMapping("/limit")
    public DataVo getCourseSubmoduleByLimit(Integer page, Integer limit) {
        return courseSubmoduleService.getCourseSubmoduleByLimit(page, limit);
    }

    @RequestMapping("/add")
    public CourseSubmoduleVo addCourseSubmodule(CourseSubmodule courseSubmodule) {
        return courseSubmoduleService.addCourseSubmodule(courseSubmodule);
    }

    @RequestMapping("/edit")
    public CourseSubmoduleVo updateCourseSubmodule(CourseSubmodule courseSubmodule) {
        return courseSubmoduleService.updateCourseSubmodule(courseSubmodule);
    }

    @RequestMapping("/delete")
    public CourseSubmoduleVo deleteCourseSubmodule(Integer id) {
        return courseSubmoduleService.deleteCourseSubmodule(id);
    }

    @RequestMapping("/batchDelete")
    public CourseSubmoduleVo batchDelete(String ids) {
        return courseSubmoduleService.batchDelete(ids);
    }

}
