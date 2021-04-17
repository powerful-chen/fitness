package com.chen.wx.controller;

import com.chen.wx.pojo.WxUser;
import com.chen.wx.service.WxUserService;
import com.chen.wx.vo.WxUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName WxUserController
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/30 15:50
 */
@RestController
@RequestMapping("/wx")
public class WxUserController {

    @Autowired
    private WxUserService wxUserService;

    @RequestMapping("/login")
    public WxUserVo selectWxUserByPhone(WxUser wxUser) {
        return wxUserService.selectWxUserByPhone(wxUser);
    }

    //注册
    @RequestMapping("/register")
    public WxUserVo addWxUser(WxUser wxUser) {
        return wxUserService.addWxUser(wxUser);
    }

    //修改密码
    @RequestMapping("/update")
    public WxUserVo updateWxUser(WxUser wxUser) {
        return wxUserService.updateWxUser(wxUser);
    }
}
