package com.chen.service.Impl;

import com.chen.mapper.CourseMapper;
import com.chen.pojo.Course;
import com.chen.service.CourseService;
import com.chen.utils.FileUtil;
import com.chen.vo.CourseVo;
import com.chen.vo.DataVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CourseServiceImpl
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/12 19:27
 */
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> getCoursesById(Integer id) {
        List<Course> coursesById = courseMapper.getCoursesById(id);
        for (Course course : coursesById) {
            course.setBackgroundImageName(FileUtil.IMAGE_URI + course.getBackgroundImageName());//设置背景图片路径
        }
        return coursesById;
    }

    //查询所有课程
    @Override
    public List<Course> getCourses() {
        return courseMapper.getCourses();
    }

    //分页
    @Override
    public DataVo<Course> getCourseByLimit(Integer page, Integer limit) {
        DataVo<Course> courseDataVo = new DataVo<>();
        page = (page - 1) * limit;
        List<Course> courseByLimit = courseMapper.getCourseByLimit(page, limit);
        if (courseByLimit != null) {
            courseDataVo.setCode(0);
            courseDataVo.setMsg("");
            for (Course course : courseByLimit) {
                course.setBackgroundImageName(FileUtil.IMAGE_URI + course.getBackgroundImageName());//设置背景图片路径
            }
            courseDataVo.setCount(courseMapper.countNums());
            courseDataVo.setData(courseByLimit);
            return courseDataVo;
        }
        courseDataVo.setMsg("请求不成功");
        return courseDataVo;
    }

    //添加课程
    @Override
    public CourseVo addCourse(Course course) {
        CourseVo courseVo = new CourseVo();
        if (courseMapper.addCourse(course) > 0) {
            courseVo.setSuccess(true);
            courseVo.setMessage("添加课程成功");
        } else {
            courseVo.setSuccess(false);
            courseVo.setMessage("添加课程失败");
        }
        return courseVo;
    }

    //修改课程
    @Override
    public CourseVo updateCourse(Course course) {
        CourseVo courseVo = new CourseVo();
        if (courseMapper.updateCourse(course) > 0) {
            courseVo.setSuccess(true);
            courseVo.setMessage("修改课程成功");
        } else {
            courseVo.setSuccess(false);
            courseVo.setMessage("修改课程失败");
        }
        return courseVo;
    }

    //删除课程
    @Override
    public CourseVo deleteCourse(Integer id) {
        CourseVo courseVo = new CourseVo();
        if (courseMapper.deleteCourse(id) > 0) {
            courseVo.setSuccess(true);
            courseVo.setMessage("删除课程成功");
        } else {
            courseVo.setSuccess(false);
            courseVo.setMessage("删除课程失败");
        }
        return courseVo;
    }

    //批量删除课程
    @Override
    public CourseVo batchDelete(String ids) {
        CourseVo courseVo = new CourseVo();
        String[] idStr = ids.split(",");
        int count = 0;
        for (int i = 0; i < idStr.length; i++) {
            count = courseMapper.deleteCourse(Integer.valueOf(idStr[i]));
            if (count > 0) {
                courseVo.setSuccess(true);
                courseVo.setMessage("删除成功");
            }
        }
        if (count <= 0) {
            courseVo.setSuccess(false);
            courseVo.setMessage("删除失败");
        }
        return courseVo;
    }
}
