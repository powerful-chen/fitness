package com.chen.service;

import com.chen.pojo.Section;
import com.chen.vo.CommonVo;
import com.chen.vo.DataVo;

import java.util.List;

public interface SectionService {

    List<Section> getList();

    DataVo<Section> getSectionsVoList(Integer page,Integer limit);

    CommonVo<Section> addSection(Section section);

    CommonVo<Section> updateSection(Section section);

    CommonVo<Section> deleteById(Integer id);

    CommonVo<Section> batchDelete(String ids);

}
