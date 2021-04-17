package com.chen.service.Impl;

import com.chen.mapper.CourseIntroductionMapper;
import com.chen.pojo.CourseIntroduction;
import com.chen.service.CourseIntroductionService;
import com.chen.vo.CourseIntroductionVo;
import com.chen.vo.DataVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CourseIntroductionServiceImpl
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/15 19:36
 */
@Service
public class CourseIntroductionServiceImpl implements CourseIntroductionService {

    @Autowired
    private CourseIntroductionMapper courseIntroductionMapper;

    @Override
    public List<CourseIntroduction> getCourseIntroductionById(Integer id) {

        return courseIntroductionMapper.getCourseIntroductionById(id);
    }

    @Override
    public List<CourseIntroduction> getCourseIntroduction() {
        return courseIntroductionMapper.getCourseIntroduction();
    }

    @Override
    public DataVo<CourseIntroduction> getCourseIntroductionByLimit(Integer page, Integer limit) {
        DataVo<CourseIntroduction> courseIntroductionDataVo = new DataVo<>();
        page = (page - 1) * limit;
        List<CourseIntroduction> courseIntroductionByLimit = courseIntroductionMapper.getCourseIntroductionByLimit(page, limit);
        if (courseIntroductionByLimit != null) {
            courseIntroductionDataVo.setCode(0);
            courseIntroductionDataVo.setMsg("");
            courseIntroductionDataVo.setCount(courseIntroductionMapper.countNums());
            courseIntroductionDataVo.setData(courseIntroductionByLimit);
            return courseIntroductionDataVo;
        }
        courseIntroductionDataVo.setMsg("请求失败了");
        return courseIntroductionDataVo;
    }

    @Override
    public CourseIntroductionVo addCourseIntroduction(CourseIntroduction courseIntroduction) {
        CourseIntroductionVo courseIntroductionVo = new CourseIntroductionVo();
        if (courseIntroductionMapper.addCourseIntroduction(courseIntroduction) > 0) {
            courseIntroductionVo.setSuccess(true);
            courseIntroductionVo.setMessage("添加课程简要介绍成功");
        } else {
            courseIntroductionVo.setSuccess(false);
            courseIntroductionVo.setMessage("添加课程简要介绍失败");
        }
        return courseIntroductionVo;
    }

    @Override
    public CourseIntroductionVo updateCourseIntroduction(CourseIntroduction courseIntroduction) {
        CourseIntroductionVo courseIntroductionVo = new CourseIntroductionVo();
        if (courseIntroductionMapper.updateCourseIntroduction(courseIntroduction) > 0) {
            courseIntroductionVo.setSuccess(true);
            courseIntroductionVo.setMessage("修改课程简要介绍成功");
        } else {
            courseIntroductionVo.setSuccess(false);
            courseIntroductionVo.setMessage("修改课程简要介绍失败");
        }
        return courseIntroductionVo;
    }

    @Override
    public CourseIntroductionVo deleteCourseIntroduction(Integer id) {
        CourseIntroductionVo courseIntroductionVo = new CourseIntroductionVo();
        if (courseIntroductionMapper.deleteCourseIntroduction(id) > 0) {
            courseIntroductionVo.setSuccess(true);
            courseIntroductionVo.setMessage("删除课程简要介绍成功");
        } else {
            courseIntroductionVo.setSuccess(false);
            courseIntroductionVo.setMessage("删除课程简要介绍失败");
        }
        return courseIntroductionVo;
    }

    @Override
    public CourseIntroductionVo batchDelete(String ids) {
        CourseIntroductionVo courseIntroductionVo = new CourseIntroductionVo();
        String[] idStr = ids.split(",");
        int count = 0;
        for (int i = 0; i < idStr.length; i++) {
            count = courseIntroductionMapper.deleteCourseIntroduction(Integer.valueOf(idStr[i]));
            if (count > 0) {
                courseIntroductionVo.setSuccess(true);
                courseIntroductionVo.setMessage("删除成功");
            }
        }
        if (count <= 0) {
            courseIntroductionVo.setSuccess(true);
            courseIntroductionVo.setMessage("删除失败");
        }
        return courseIntroductionVo;
    }
}
