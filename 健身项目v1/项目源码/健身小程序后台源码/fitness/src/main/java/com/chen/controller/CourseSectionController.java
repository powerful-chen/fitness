package com.chen.controller;

import com.chen.pojo.CourseSection;
import com.chen.service.CourseSectionService;
import com.chen.vo.CourseSectionVo;
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
@RequestMapping("/cs")
public class CourseSectionController {

    @Autowired
    private CourseSectionService courseSectionService;

    @RequestMapping("/getCourseSectionById")
    public List<CourseSection> getCourseSectionById(Integer id) {
        return courseSectionService.getCourseSectionById(id);
    }

    @RequestMapping("/list")
    public List<CourseSection> getCourseSections(){
        return courseSectionService.getCourseSections();
    }


    @RequestMapping("/limit")
    public DataVo getCourseSectionByLimit(Integer page,Integer limit){
        return courseSectionService.getCourseSectionByLimit(page,limit);
    }

    @RequestMapping("/add")
    public CourseSectionVo addCourseSection(CourseSection courseSection){
        return courseSectionService.addCourseSection(courseSection);
    }

    @RequestMapping("/edit")
    public CourseSectionVo updateCourseSection(CourseSection courseSection){
        return courseSectionService.updateCourseSection(courseSection);
    }

    @RequestMapping("/delete")
    public CourseSectionVo deleteCourseSection(Integer id){
        return courseSectionService.deleteCourseSection(id);
    }

    @RequestMapping("/batchDelete")
    public CourseSectionVo batchDelete(String ids) {
        return courseSectionService.batchDelete(ids);
    }
}
