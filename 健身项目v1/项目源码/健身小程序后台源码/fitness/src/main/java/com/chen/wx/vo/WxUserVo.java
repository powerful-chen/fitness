package com.chen.wx.vo;

import com.chen.wx.pojo.WxUser;
import lombok.Data;

/**
 * @ClassName WxUserVo
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/30 15:30
 */

@Data
public class WxUserVo {
    private boolean success;
    private String message;
    private WxUser data;
}
