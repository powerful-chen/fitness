package com.chen.controller;

import com.chen.pojo.Section;
import com.chen.service.SectionService;
import com.chen.vo.CommonVo;
import com.chen.vo.DataVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName SectionController
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/2 11:40
 */
@RestController
@RequestMapping("/section")
public class SectionController {

    @Autowired
    private SectionService sectionService;

    @RequestMapping("/list")
    public List<Section> getList(){
        return sectionService.getList();
    }

    //分页
    @RequestMapping("/limit")
    public DataVo pageLimit(Integer page, Integer limit) {
        return sectionService.getSectionsVoList(page, limit);
    }

    //添加
    @RequestMapping("/add")
    public CommonVo addSection(Section section) {
        return sectionService.addSection(section);
    }

    //分页
    @RequestMapping("/edit")
    public CommonVo updateSection(Section section) {
        return sectionService.updateSection(section);
    }

    //删除
    @RequestMapping("/delete")
    public CommonVo deleteSection(Integer id) {
        return sectionService.deleteById(id);
    }

    //批量删除
    @RequestMapping("/batchDelete")
    public CommonVo batchDelete(String ids) {
        return sectionService.batchDelete(ids);
    }

}
