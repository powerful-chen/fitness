package com.chen.mapper;

import com.chen.pojo.CourseSubmodule;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CourseSubmoduleMapperTest {

    @Autowired
    private CourseSubmoduleMapper courseSubmoduleMapper;

    @Test
    void getCourseSubmodule() {
        List<CourseSubmodule> courseSubmodule = courseSubmoduleMapper.getCourseSubmodule();
        for (CourseSubmodule submodule : courseSubmodule) {
            System.out.println(submodule);
        }
    }

    @Test
    void getCourseSubmoduleByLimit() {
        List<CourseSubmodule> courseSubmoduleByLimit = courseSubmoduleMapper.getCourseSubmoduleByLimit(0, 5);
        System.out.println(courseSubmoduleByLimit);
    }

    @Test
    void countNums() {
        System.out.println(courseSubmoduleMapper.countNums());
    }

    @Test
    void addCourseSubmodule() {
        CourseSubmodule courseSubmodule = new CourseSubmodule();
        courseSubmodule.setCourseId(1);
        courseSubmodule.setThumbName("1.png");
        courseSubmodule.setCourseSubTitle("测试");
        courseSubmodule.setTrainingTime("10分钟");
        courseSubmoduleMapper.addCourseSubmodule(courseSubmodule);
        courseSubmoduleMapper.addCourseSubmodule(courseSubmodule);
        courseSubmoduleMapper.addCourseSubmodule(courseSubmodule);
        courseSubmoduleMapper.addCourseSubmodule(courseSubmodule);
        courseSubmoduleMapper.addCourseSubmodule(courseSubmodule);
        courseSubmoduleMapper.addCourseSubmodule(courseSubmodule);
        courseSubmoduleMapper.addCourseSubmodule(courseSubmodule);
        courseSubmoduleMapper.addCourseSubmodule(courseSubmodule);
        courseSubmoduleMapper.addCourseSubmodule(courseSubmodule);
        courseSubmoduleMapper.addCourseSubmodule(courseSubmodule);
        if (courseSubmoduleMapper.addCourseSubmodule(courseSubmodule)>0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }

    @Test
    void updateCourseSubmodule() {
        CourseSubmodule courseSubmodule = new CourseSubmodule();
        courseSubmodule.setCourseSubId(3);
        courseSubmodule.setCourseId(1);
        courseSubmodule.setThumbName("1.png");
        courseSubmodule.setCourseSubTitle("测试");
        courseSubmodule.setTrainingTime("8分钟");
        if (courseSubmoduleMapper.updateCourseSubmodule(courseSubmodule)>0){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }

    @Test
    void deleteCourseSubmodule() {
        if (courseSubmoduleMapper.deleteCourseSubmodule(25)>0){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }
}