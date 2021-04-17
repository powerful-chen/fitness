package com.chen.mapper;

import com.chen.pojo.Section;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SectionMapper {

    //查询所有栏目list
    List<Section> getSectionsList();

    //添加栏目
    int addSection(Section section);

    //修改栏目
    int updateSection(Section section);

    //通过id删除栏目
    int deleteById(@Param("sectionId") Integer id);

    //统计所有栏目数
    int getCountNums();

    //分页查询
    List<Section> getSectionByLimit(Integer page, Integer limit);

    //批量删除
    Section getSectionById(@Param("sectionId") Integer id);

}
