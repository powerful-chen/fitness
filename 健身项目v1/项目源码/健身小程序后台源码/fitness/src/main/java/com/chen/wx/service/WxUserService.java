package com.chen.wx.service;

import com.chen.wx.pojo.WxUser;
import com.chen.wx.vo.WxUserVo;

/**
 * @ClassName WxUserService
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/30 15:33
 */
public interface WxUserService {
    WxUserVo selectWxUserByPhone(WxUser wxUser);

    WxUserVo addWxUser(WxUser wxUser);

    WxUserVo updateWxUser(WxUser wxUser);
}
