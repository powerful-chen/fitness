package com.chen.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Section
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/2/17 22:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//栏目
public class Section {
    private Integer sectionId;
    private String sectionName;
}
