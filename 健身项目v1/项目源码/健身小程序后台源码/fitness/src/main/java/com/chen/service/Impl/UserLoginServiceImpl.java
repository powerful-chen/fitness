package com.chen.service.Impl;

import com.chen.mapper.UserLoginMapper;
import com.chen.pojo.CourseSection;
import com.chen.pojo.UserLogin;
import com.chen.service.UserLoginService;
import com.chen.vo.CommonVo;
import com.chen.vo.CourseSectionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * @ClassName UserLoginServiceImpl
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/10 23:24
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserLoginMapper userLoginMapper;

    @Override
    public CommonVo<UserLogin> login(String userName, String password) {
        UserLogin user = userLoginMapper.findUserByLoginName(userName);
        CommonVo<UserLogin> userLoginCommonVo = new CommonVo<>();
        if (user != null) {
            if (password.equals(user.getPassword())) {

                userLoginCommonVo.setSuccess(true);
                userLoginCommonVo.setMessage("登录成功");
                userLoginCommonVo.setData(user);
                return userLoginCommonVo;
            }
        }
        userLoginCommonVo.setSuccess(false);
        userLoginCommonVo.setMessage("登录失败，请检查用户名和密码");
        return userLoginCommonVo;
    }

}
