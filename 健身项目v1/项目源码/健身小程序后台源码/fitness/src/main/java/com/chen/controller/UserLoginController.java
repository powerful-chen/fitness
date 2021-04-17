package com.chen.controller;

import com.chen.service.UserLoginService;
import com.chen.vo.CommonVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @ClassName UserLoginController
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/10 23:26
 */
@RestController
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping("/login")
    public CommonVo login(String userName, String password, HttpSession session) {
        System.out.println("用户名" + userName + "密码" + password);
        session.setAttribute("userName", userName);
        return userLoginService.login(userName, password);
    }
}
