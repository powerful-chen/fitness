package com.chen.mapper;

import com.chen.pojo.CourseDetails;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CourseDetailsMapperTest {

    @Autowired
    private CourseDetailsMapper courseDetailsMapper;

    @Test
    void getCourseDetails() {
        List<CourseDetails> courseDetails = courseDetailsMapper.getCourseDetails();
        System.out.println(courseDetails);
    }

    @Test
    void getCourseDetailsByLimit() {
        List<CourseDetails> courseDetailsByLimit = courseDetailsMapper.getCourseDetailsByLimit(0, 5);
        System.out.println(courseDetailsByLimit);
    }

    @Test
    void countNums() {
        System.out.println(courseDetailsMapper.countNums());
    }

    @Test
    void addCourseDetails() {
        CourseDetails courseDetails = new CourseDetails();
        courseDetails.setCourseSubId(1);
        courseDetails.setImageName("1.png");
        courseDetails.setStep("测试");
        courseDetails.setBreathe("测试");
        courseDetails.setFeel("测试");
        courseDetails.setFault("测试");
        courseDetails.setTip("测试");
        courseDetailsMapper.addCourseDetails(courseDetails);
        courseDetailsMapper.addCourseDetails(courseDetails);
        courseDetailsMapper.addCourseDetails(courseDetails);
        courseDetailsMapper.addCourseDetails(courseDetails);
        courseDetailsMapper.addCourseDetails(courseDetails);
        courseDetailsMapper.addCourseDetails(courseDetails);
        courseDetailsMapper.addCourseDetails(courseDetails);
        courseDetailsMapper.addCourseDetails(courseDetails);
        courseDetailsMapper.addCourseDetails(courseDetails);
        courseDetailsMapper.addCourseDetails(courseDetails);
        if (courseDetailsMapper.addCourseDetails(courseDetails)>0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }

    @Test
    void updateCourseDetails() {
        CourseDetails courseDetails = new CourseDetails();
        courseDetails.setCourseSubId(1);
        courseDetails.setImageName("1.png");
        courseDetails.setStep("测试1");
        courseDetails.setBreathe("测试2");
        courseDetails.setFeel("测试3");
        courseDetails.setFault("测试");
        courseDetails.setTip("测试");
        courseDetails.setCourseContentId(25);
        if (courseDetailsMapper.updateCourseDetails(courseDetails)>0){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }

    @Test
    void deleteCourseDetails() {
        if (courseDetailsMapper.deleteCourseDetails(27)>0){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }
}