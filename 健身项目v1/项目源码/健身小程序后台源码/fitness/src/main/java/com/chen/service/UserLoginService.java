package com.chen.service;

import com.chen.pojo.UserLogin;
import com.chen.vo.CommonVo;

/**
 * @ClassName UserLoginService
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/10 23:23
 */
public interface UserLoginService {

    CommonVo<UserLogin> login(String userName, String password);
}
