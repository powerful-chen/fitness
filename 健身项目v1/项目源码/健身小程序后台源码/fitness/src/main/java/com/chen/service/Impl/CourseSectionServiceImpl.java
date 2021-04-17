package com.chen.service.Impl;

import com.chen.mapper.CourseSectionMapper;
import com.chen.pojo.CourseSection;
import com.chen.service.CourseSectionService;
import com.chen.utils.FileUtil;
import com.chen.vo.CourseSectionVo;
import com.chen.vo.DataVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CourseSectionImpl
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/11 12:40
 */
@Service
public class CourseSectionServiceImpl implements CourseSectionService {

    @Autowired
    private CourseSectionMapper courseSectionMapper;

    @Override
    public List<CourseSection> getCourseSectionById(Integer id) {
        List<CourseSection> courseSectionById = courseSectionMapper.getCourseSectionById(id);
        for (CourseSection courseSection : courseSectionById) {
            courseSection.setBackgroundImage(FileUtil.IMAGE_URI + courseSection.getBackgroundImage());
        }
        return courseSectionById;
    }

    @Override
    public List<CourseSection> getCourseSections() {
        return courseSectionMapper.getCourseSection();
    }

    //处理分页数据
    @Override
    public DataVo<CourseSection> getCourseSectionByLimit(Integer page, Integer limit) {
        DataVo<CourseSection> courseSectionDataVo = new DataVo<>();
        page = (page - 1) * limit;
        List<CourseSection> courseSectionByLimit = courseSectionMapper.getCourseSectionByLimit(page, limit);
        if (courseSectionByLimit != null) {
            courseSectionDataVo.setCode(0);
            courseSectionDataVo.setMsg("");
            courseSectionDataVo.setCount(courseSectionMapper.countNums());
            courseSectionDataVo.setData(courseSectionByLimit);
            return courseSectionDataVo;
        }
        courseSectionDataVo.setMsg("请求失败");
        return courseSectionDataVo;
    }

    //添加课程栏目
    @Override
    public CourseSectionVo addCourseSection(CourseSection courseSection) {
        CourseSectionVo courseSectionVo = new CourseSectionVo();
        if (courseSectionMapper.addCourseSection(courseSection) > 0) {
            courseSectionVo.setSuccess(true);
            courseSectionVo.setMessage("添加课程栏目成功");
        } else {
            courseSectionVo.setSuccess(false);
            courseSectionVo.setMessage("添加课程栏目失败");
        }
        return courseSectionVo;
    }

    //修改课程栏目
    @Override
    public CourseSectionVo updateCourseSection(CourseSection courseSection) {
        CourseSectionVo courseSectionVo = new CourseSectionVo();
        if (courseSectionMapper.updateCourseSection(courseSection) > 0) {
            courseSectionVo.setSuccess(true);
            courseSectionVo.setMessage("修改课程栏目成功");
        } else {
            courseSectionVo.setSuccess(false);
            courseSectionVo.setMessage("修改课程栏目失败");
        }
        return courseSectionVo;
    }

    //删除课程栏目
    @Override
    public CourseSectionVo deleteCourseSection(Integer id) {
        CourseSectionVo courseSectionVo = new CourseSectionVo();
        if (courseSectionMapper.deleteCourseSection(id) > 0) {
            courseSectionVo.setSuccess(true);
            courseSectionVo.setMessage("删除课程栏目成功");
        } else {
            courseSectionVo.setSuccess(false);
            courseSectionVo.setMessage("删除课程栏目失败");
        }
        return courseSectionVo;
    }

    //批量删除课程栏目
    @Override
    public CourseSectionVo batchDelete(String ids) {
        CourseSectionVo courseSectionVo = new CourseSectionVo();
        String[] idStr = ids.split(",");
        int count = 0;
        for (int i = 0; i < idStr.length; i++) {
            count = courseSectionMapper.deleteCourseSection(Integer.valueOf(idStr[i]));
            if (count > 0) {
                courseSectionVo.setSuccess(true);
                courseSectionVo.setMessage("删除成功");
            }
        }
        if (count <= 0) {
            courseSectionVo.setSuccess(false);
            courseSectionVo.setMessage("删除失败");
        }
        return courseSectionVo;
    }
}
