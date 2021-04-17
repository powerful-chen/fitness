package com.chen.controller;

import com.chen.pojo.Course;
import com.chen.service.CourseService;
import com.chen.vo.CourseVo;
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
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/getCoursesById")
    public List<Course> getCoursesById(Integer id) {
        return courseService.getCoursesById(id);
    }

    @RequestMapping("/list")
    public List<Course> getCourses() {
        return courseService.getCourses();
    }

    @RequestMapping("/limit")
    public DataVo getCourseByLimit(Integer page, Integer limit) {
        return courseService.getCourseByLimit(page, limit);
    }

    @RequestMapping("/add")
    public CourseVo addCourse(Course course) {
        return courseService.addCourse(course);
    }

    @RequestMapping("/edit")
    public CourseVo updateCourse(Course course) {
        return courseService.updateCourse(course);
    }

    @RequestMapping("/delete")
    public CourseVo deleteCourse(Integer id) {
        return courseService.deleteCourse(id);
    }

    @RequestMapping("/batchDelete")
    public CourseVo batchDelete(String ids) {
        return courseService.batchDelete(ids);
    }


}
