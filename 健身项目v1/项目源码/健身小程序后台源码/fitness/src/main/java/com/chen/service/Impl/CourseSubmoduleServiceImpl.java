package com.chen.service.Impl;

import com.chen.mapper.CourseSubmoduleMapper;
import com.chen.pojo.CourseSubmodule;
import com.chen.service.CourseSubmoduleService;
import com.chen.utils.FileUtil;
import com.chen.vo.CourseSubmoduleVo;
import com.chen.vo.DataVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CourseSubmoduleServiceImpl
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/19 11:06
 */
@Service
public class CourseSubmoduleServiceImpl implements CourseSubmoduleService {

    @Autowired
    private CourseSubmoduleMapper courseSubmoduleMapper;

    @Override
    public List<CourseSubmodule> getCourseSubmodulebyId(Integer id) {
        return courseSubmoduleMapper.getCourseSubmodulebyId(id);
    }

    @Override
    public List<CourseSubmodule> getCourseSubmodules() {
        return courseSubmoduleMapper.getCourseSubmodule();
    }

    @Override
    public DataVo<CourseSubmodule> getCourseSubmoduleByLimit(Integer page, Integer limit) {
        DataVo<CourseSubmodule> courseSubmoduleDataVo = new DataVo<>();
        page = (page - 1) * limit;
        List<CourseSubmodule> courseSubmoduleByLimit = courseSubmoduleMapper.getCourseSubmoduleByLimit(page, limit);
        if (courseSubmoduleByLimit != null) {
            courseSubmoduleDataVo.setCode(0);
            courseSubmoduleDataVo.setMsg("");
            for (CourseSubmodule courseSubmodule : courseSubmoduleByLimit) {
                courseSubmodule.setThumbName(FileUtil.IMAGE_URI + courseSubmodule.getThumbName());//设置背景图片路径
            }
            courseSubmoduleDataVo.setCount(courseSubmoduleMapper.countNums());
            courseSubmoduleDataVo.setData(courseSubmoduleByLimit);
            return courseSubmoduleDataVo;
        }
        courseSubmoduleDataVo.setMsg("请求失败了了");
        return courseSubmoduleDataVo;
    }

    @Override
    public CourseSubmoduleVo addCourseSubmodule(CourseSubmodule courseSubmodule) {
        CourseSubmoduleVo courseSubmoduleVo = new CourseSubmoduleVo();
        if (courseSubmoduleMapper.addCourseSubmodule(courseSubmodule) > 0) {
            courseSubmoduleVo.setSuccess(true);
            courseSubmoduleVo.setMessage("添加课程栏目成功");
        } else {
            courseSubmoduleVo.setSuccess(false);
            courseSubmoduleVo.setMessage("添加课程栏目失败");
        }
        return courseSubmoduleVo;
    }

    @Override
    public CourseSubmoduleVo updateCourseSubmodule(CourseSubmodule courseSubmodule) {
        CourseSubmoduleVo courseSubmoduleVo = new CourseSubmoduleVo();
        if (courseSubmoduleMapper.updateCourseSubmodule(courseSubmodule) > 0) {
            courseSubmoduleVo.setSuccess(true);
            courseSubmoduleVo.setMessage("修改课程栏目成功");
        } else {
            courseSubmoduleVo.setSuccess(false);
            courseSubmoduleVo.setMessage("修改课程栏目失败");
        }
        return courseSubmoduleVo;
    }

    @Override
    public CourseSubmoduleVo deleteCourseSubmodule(Integer id) {
        CourseSubmoduleVo courseSubmoduleVo = new CourseSubmoduleVo();
        if (courseSubmoduleMapper.deleteCourseSubmodule(id) > 0) {
            courseSubmoduleVo.setSuccess(true);
            courseSubmoduleVo.setMessage("删除课程栏目成功");
        } else {
            courseSubmoduleVo.setSuccess(false);
            courseSubmoduleVo.setMessage("删除课程栏目失败");
        }
        return courseSubmoduleVo;
    }

    @Override
    public CourseSubmoduleVo batchDelete(String ids) {
        CourseSubmoduleVo courseSubmoduleVo = new CourseSubmoduleVo();
        String[] idStr = ids.split(",");
        int count = 0;
        for (int i = 0; i < idStr.length; i++) {
            count = courseSubmoduleMapper.deleteCourseSubmodule(Integer.valueOf(idStr[i]));
            if (count > 0) {
                courseSubmoduleVo.setSuccess(true);
                courseSubmoduleVo.setMessage("删除成功");
            }
        }
        if (count <= 0) {
            courseSubmoduleVo.setSuccess(false);
            courseSubmoduleVo.setMessage("删除失败");
        }
        return courseSubmoduleVo;
    }
}
