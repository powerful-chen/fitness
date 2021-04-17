package com.chen.service.Impl;

import com.chen.mapper.SectionMapper;
import com.chen.pojo.Section;
import com.chen.service.SectionService;
import com.chen.vo.CommonVo;
import com.chen.vo.DataVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName SectionServiceImpl
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/2 11:35
 */
@Service
public class SectionServiceImpl implements SectionService {

    @Autowired
    private SectionMapper sectionMapper;

    @Override
    public List<Section> getList(){
        return sectionMapper.getSectionsList();
    }

    //分页查询栏目记录
    @Override
    public DataVo<Section> getSectionsVoList(Integer page, Integer limit) {
        DataVo dataVo = new DataVo();
        dataVo.setCode(0);
        dataVo.setMsg("");
        dataVo.setCount(sectionMapper.getCountNums());
        page = (page - 1) * limit;
        List<Section> list = sectionMapper.getSectionByLimit(page, limit);
        dataVo.setData(list);
        return dataVo;
    }

    @Override
    public CommonVo<Section> addSection(Section section) {
        CommonVo<Section> sectionCommonVo = new CommonVo<>();
        if (sectionMapper.addSection(section) > 0) {
            sectionCommonVo.setSuccess(true);
            sectionCommonVo.setMessage("添加成功");
        } else {
            sectionCommonVo.setSuccess(false);
            sectionCommonVo.setMessage("添加失败");
        }
        return sectionCommonVo;
    }

    @Override
    public CommonVo<Section> updateSection(Section section) {
        CommonVo<Section> sectionCommonVo = new CommonVo<>();
        if (sectionMapper.updateSection(section) > 0) {
            sectionCommonVo.setSuccess(true);
            sectionCommonVo.setMessage("修改成功");
        } else {
            sectionCommonVo.setSuccess(false);
            sectionCommonVo.setMessage("修改失败");
        }
        return sectionCommonVo;
    }

    @Override
    public CommonVo<Section> deleteById(Integer id) {
        CommonVo<Section> sectionCommonVo = new CommonVo<>();
        if (sectionMapper.deleteById(id) > 0) {
            sectionCommonVo.setSuccess(true);
            sectionCommonVo.setMessage("删除成功");
        } else {
            sectionCommonVo.setSuccess(false);
            sectionCommonVo.setMessage("删除失败");
        }
        return sectionCommonVo;
    }

    @Override
    public CommonVo<Section> batchDelete(String ids) {
        CommonVo<Section> sectionCommonVo = new CommonVo<>();
        String[] idStr = ids.split(",");
        int count = 0;
        for (int i = 0; i < idStr.length; i++) {
            count = sectionMapper.deleteById(Integer.valueOf(idStr[i]));
            if (count > 0) {
                sectionCommonVo.setSuccess(true);
                sectionCommonVo.setMessage("删除成功");
            }
        }
        if (count <= 0) {
            sectionCommonVo.setSuccess(false);
            sectionCommonVo.setMessage("删除失败");
        }
        return sectionCommonVo;
    }
}
