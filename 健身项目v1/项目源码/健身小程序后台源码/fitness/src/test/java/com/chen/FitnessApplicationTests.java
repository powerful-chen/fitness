package com.chen;

import com.chen.mapper.*;
import com.chen.pojo.Course;
import com.chen.pojo.CourseIntroduction;
import com.chen.pojo.CourseSection;
import com.chen.pojo.UserLogin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class FitnessApplicationTests {

    @Autowired
    private CourseIntroductionMapper courseIntroductionMapper;

    @Test
    void contextLoads() throws SQLException {
        //List<Course> courseByLimit = courseMapper.getCourseByLimit(0, 1);
        //System.out.println(courseByLimit);

        //Course course = new Course();
        //course.setCourseSectionId(1);
        //course.setCourseSectionName("跑前热身");
        //course.setCalories("20");
        //course.setIntensity("20千卡");
        //course.setTimes("10");
        //course.setTrainingFrequency("两三天一次");
        //course.setBackgroundImageName("/2.png");
        //if (courseMapper.addCourse(course) > 0) {
        //    System.out.println("修改成功");
        //} else {
        //    System.out.println("修改失败");
        //}

        //if (courseMapper.deleteCourse(14)>0){
        //    System.out.println("修改成功");
        //}else {
        //    System.out.println("修改失败");
        //}

        //List<CourseIntroduction> courseIntroductionByLimit = courseIntroductionMapper.getCourseIntroductionByLimit(0, 5);
        //System.out.println(courseIntroductionByLimit);

        CourseIntroduction courseIntroduction = new CourseIntroduction();
        courseIntroduction.setCourseIntroId(0);
        courseIntroduction.setCourseId(1);
        courseIntroduction.setCourseIntroDetail("test");
        courseIntroduction.setCourseIntroType("test");
        courseIntroduction.setFitCrowd("test");
        courseIntroduction.setTabooCrowd("test");
        courseIntroduction.setPrepare("test");
        courseIntroduction.setPhysicalReaction("test");
        courseIntroduction.setAdvice("test123");
        if (courseIntroductionMapper.addCourseIntroduction(courseIntroduction)>0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }

        //if (courseIntroductionMapper.deleteCourseIntroduction(15)>0){
        //    System.out.println("删除成功");
        //}else {
        //    System.out.println("删除失败");
        //}

    }

}
