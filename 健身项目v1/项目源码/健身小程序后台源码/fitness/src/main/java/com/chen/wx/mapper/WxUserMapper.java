package com.chen.wx.mapper;

import com.chen.wx.pojo.WxUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface WxUserMapper {

    WxUser selectWxUserByPhone(String phone);

    int addWxUser(WxUser wxUser);

    int updateWxUser(WxUser wxUser);
}
