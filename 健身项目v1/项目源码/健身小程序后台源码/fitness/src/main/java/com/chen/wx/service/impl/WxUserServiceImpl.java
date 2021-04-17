package com.chen.wx.service.impl;

import com.chen.wx.mapper.WxUserMapper;
import com.chen.wx.pojo.WxUser;
import com.chen.wx.service.WxUserService;
import com.chen.wx.vo.WxUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName WxUserServiceImpl
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/30 15:35
 */
@Service
public class WxUserServiceImpl implements WxUserService {

    @Autowired
    private WxUserMapper wxUserMapper;

    @Override
    public WxUserVo selectWxUserByPhone(WxUser wxUser) {
        WxUserVo wxUserVo = new WxUserVo();
        if (wxUser != null) {
            WxUser user = wxUserMapper.selectWxUserByPhone(wxUser.getPhone());
            if (wxUser.getPassword().equals(user.getPassword())){
                wxUserVo.setSuccess(true);
                wxUserVo.setMessage("登录成功");
                wxUserVo.setData(user);
                return wxUserVo;
            }
        }
        wxUserVo.setSuccess(false);
        wxUserVo.setMessage("登录失败");
        return wxUserVo;
    }

    @Override
    public WxUserVo addWxUser(WxUser wxUser) {
        WxUserVo wxUserVo = new WxUserVo();
        if (wxUser != null) {
            if (wxUserMapper.addWxUser(wxUser) > 0) {
                wxUserVo.setSuccess(true);
                wxUserVo.setMessage("添加成功");
                return wxUserVo;
            }
        }
        wxUserVo.setSuccess(false);
        wxUserVo.setMessage("添加失败");
        return wxUserVo;
    }

    @Override
    public WxUserVo updateWxUser(WxUser wxUser) {
        WxUserVo wxUserVo = new WxUserVo();
        if (wxUser != null) {
            if (null != wxUserMapper.selectWxUserByPhone(wxUser.getPhone())) {
                if (wxUserMapper.updateWxUser(wxUser) > 0) {
                    wxUserVo.setSuccess(true);
                    wxUserVo.setMessage("修改成功");
                    return wxUserVo;
                }
            }
        }
        wxUserVo.setSuccess(false);
        wxUserVo.setMessage("修改失败");
        return wxUserVo;
    }
}
