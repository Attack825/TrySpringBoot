package com.example.tryspringboot.service.intf;

import com.example.tryspringboot.exception.UserException;
import com.example.tryspringboot.model.dto.UserLoginReq;
import com.example.tryspringboot.model.dto.UserLoginResp;
import com.example.tryspringboot.model.dto.UserRegisterReq;
import com.example.tryspringboot.model.dto.UserRegisterResp;
import com.example.tryspringboot.model.entity.Result;

import javax.security.auth.login.AccountException;
import javax.security.auth.login.AccountNotFoundException;

/**
 * @Author: xwj
 * @Date: 2024/2/8
 * @Description:
 */
public interface UserService {
    /**
     * 登录
     *
     * @param userLoginReq 用户登录请求
     * @return UserLoginResp 用户登录响应
     * @throws UserException 用户异常
     */
    public UserLoginResp login(UserLoginReq userLoginReq) throws UserException;

    /**
     * 注册
     *
     * @param userRegisterReq 用户注册请求
     * @return UserRegisterResp 用户注册响应
     * @throws UserException 用户异常
     */
    public UserRegisterResp register(UserRegisterReq userRegisterReq) throws UserException;
}
