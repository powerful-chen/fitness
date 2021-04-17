package com.chen.wx.mapper;

import com.chen.wx.pojo.WxUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WxUserMapperTest {

    @Autowired
    private WxUserMapper wxUserMapper;

    @Test
    void selectWxUserByPhone() {
        WxUser wxUser = wxUserMapper.selectWxUserByPhone("13111111111");
        System.out.println(wxUser);
    }

    @Test
    void addWxUser() {
        WxUser wxUser = new WxUser();
        wxUser.setPhone("13111111111");
        wxUser.setPassword("1234");
        if (wxUserMapper.addWxUser(wxUser)>0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }

    @Test
    void updateWxUser() {
        WxUser wxUser = new WxUser();
        wxUser.setPhone("13111111111");
        wxUser.setPassword("12345");
        if (wxUserMapper.updateWxUser(wxUser)>0){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }
}