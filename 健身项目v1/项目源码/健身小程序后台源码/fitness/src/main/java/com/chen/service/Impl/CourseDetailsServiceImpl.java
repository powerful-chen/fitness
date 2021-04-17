package com.chen.service.Impl;

import com.chen.mapper.CourseDetailsMapper;
import com.chen.pojo.CourseDetails;
import com.chen.pojo.CourseIntroduction;
import com.chen.service.CourseDetailsService;
import com.chen.utils.FileUtil;
import com.chen.vo.CourseDetailsVo;
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
public class CourseDetailsServiceImpl implements CourseDetailsService {

    @Autowired
    private CourseDetailsMapper courseDetailsMapper;

    @Override
    public List<CourseDetails> getCourseDetailsById(Integer id) {
        List<CourseDetails> courseDetailsById = courseDetailsMapper.getCourseDetailsById(id);
        for (CourseDetails courseDetails : courseDetailsById) {
            courseDetails.setImageName(FileUtil.IMAGE_URI + courseDetails.getImageName());
        }
        return courseDetailsById;
    }

    //查询所有课程详情
    @Override
    public List<CourseDetails> getCourseDetails() {
        return courseDetailsMapper.getCourseDetails();
    }

    //分页详情
    @Override
    public DataVo<CourseDetails> getCourseDetailsByLimit(Integer page, Integer limit) {
        DataVo<CourseDetails> courseDetailsDataVo = new DataVo<>();
        page = (page - 1) * limit;
        List<CourseDetails> courseDetailsByLimit = courseDetailsMapper.getCourseDetailsByLimit(page, limit);
        if (courseDetailsByLimit != null) {
            courseDetailsDataVo.setCode(0);
            courseDetailsDataVo.setMsg("");
            for (CourseDetails courseDetails : courseDetailsByLimit) {
                courseDetails.setImageName(FileUtil.IMAGE_URI + courseDetails.getImageName());
            }
            courseDetailsDataVo.setCount(courseDetailsMapper.countNums());
            courseDetailsDataVo.setData(courseDetailsByLimit);
            return courseDetailsDataVo;
        }
        courseDetailsDataVo.setMsg("请求不成功");
        return courseDetailsDataVo;
    }

    //添加课程详情
    @Override
    public CourseDetailsVo addCourseDetails(CourseDetails courseDetails) {
        CourseDetailsVo courseDetailsVo = new CourseDetailsVo();
        if (courseDetailsMapper.addCourseDetails(courseDetails) > 0) {
            courseDetailsVo.setSuccess(true);
            courseDetailsVo.setMessage("添加课程详情成功");
        } else {
            courseDetailsVo.setSuccess(false);
            courseDetailsVo.setMessage("添加课程详情失败");
        }
        return courseDetailsVo;
    }

    //修改课程详情
    @Override
    public CourseDetailsVo updateCourseDetails(CourseDetails courseDetails) {
        CourseDetailsVo courseDetailsVo = new CourseDetailsVo();
        if (courseDetailsMapper.updateCourseDetails(courseDetails) > 0) {
            courseDetailsVo.setSuccess(true);
            courseDetailsVo.setMessage("修改课程详情成功");
        } else {
            courseDetailsVo.setSuccess(false);
            courseDetailsVo.setMessage("修改课程详情失败");
        }
        return courseDetailsVo;
    }

    //删除课程详情
    @Override
    public CourseDetailsVo deleteDetails(Integer id) {
        CourseDetailsVo courseDetailsVo = new CourseDetailsVo();
        if (courseDetailsMapper.deleteCourseDetails(id) > 0) {
            courseDetailsVo.setSuccess(true);
            courseDetailsVo.setMessage("删除课程详情成功");
        } else {
            courseDetailsVo.setSuccess(false);
            courseDetailsVo.setMessage("删除课程详情失败");
        }
        return courseDetailsVo;
    }

    //批量删除课程详情
    @Override
    public CourseDetailsVo batchDelete(String ids) {
        CourseDetailsVo courseDetailsVo = new CourseDetailsVo();
        String[] idStr = ids.split(",");
        int count = 0;
        for (int i = 0; i < idStr.length; i++) {
            count = courseDetailsMapper.deleteCourseDetails(Integer.valueOf(idStr[i]));
            if (count > 0) {
                courseDetailsVo.setSuccess(true);
                courseDetailsVo.setMessage("删除成功");
            }
        }
        if (count <= 0) {
            courseDetailsVo.setSuccess(false);
            courseDetailsVo.setMessage("删除失败");
        }
        return courseDetailsVo;
    }
}
