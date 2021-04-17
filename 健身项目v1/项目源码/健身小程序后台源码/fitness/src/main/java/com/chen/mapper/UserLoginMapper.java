package com.chen.mapper;

import com.chen.pojo.UserLogin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserLoginMapper
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/3/10 11:39
 */
@Mapper
@Repository
public interface UserLoginMapper {
    UserLogin findUserByLoginName(String userName);
}
