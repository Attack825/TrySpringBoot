package com.example.tryspringboot.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.example.tryspringboot.constant.enums.UserErrorCode;
import com.example.tryspringboot.exception.UserException;
import com.example.tryspringboot.model.dto.UserLoginReq;
import com.example.tryspringboot.model.dto.UserLoginResp;
import com.example.tryspringboot.model.dto.UserRegisterReq;
import com.example.tryspringboot.model.dto.UserRegisterResp;
import com.example.tryspringboot.model.entity.Result;
import com.example.tryspringboot.model.entity.ResultGenerator;
import com.example.tryspringboot.service.intf.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: xwj
 * @Date: 2024/2/16
 * @Description:
 */
@RestController
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    private final UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(consumes = "application/json", value = "/login")
    public Result login(@RequestBody UserLoginReq userLoginReq) {
        try {
            UserLoginResp resp = userService.login(userLoginReq);
            logger.info("login success");
            return ResultGenerator.getDefaultSuccessResult(resp);
        } catch (UserException e) {
            if (e.getErrorCode() == UserErrorCode.INCORRECT_PASSWORD) {
                logger.info("Incorrect password: " + e.getMessage());
                return ResultGenerator.getResult(e.getErrorCode().getStatus().value(), e.getMessage(), null);
            } else if (e.getErrorCode() == UserErrorCode.USER_NOT_FOUND) {
                logger.info("User not found: " + e.getMessage());
                return ResultGenerator.getResult(e.getErrorCode().getStatus().value(), e.getMessage(), null);
            } else {
                logger.info("Unknown error: " + e.getMessage());
                return ResultGenerator.getDefaultFailResult(e.getMessage());
            }
        }
    }

    @RequestMapping("/isLogin")
    public String isLogin() {
        return "当前会话是否登录：" + StpUtil.isLogin();
    }

    @RequestMapping("/logout")
    public String logout() {
        StpUtil.logout();
        return "已退出登录" + "当前会话是否登录" + StpUtil.isLogin();
    }

    @PostMapping(consumes = "application/json", value = "/register")
    public Result register(@RequestBody UserRegisterReq userRegisterReq) {
        try {
            logger.debug(userRegisterReq.toString());
            UserRegisterResp resp = userService.register(userRegisterReq);
            return ResultGenerator.getDefaultSuccessResult(resp);
        } catch (UserException e) {
            if (e.getErrorCode() == UserErrorCode.USER_ALREADY_EXISTS) {
                logger.info("User already exists: " + e.getMessage());
                return ResultGenerator.getResult(e.getErrorCode().getStatus().value(), e.getMessage(), null);
            } else {
                logger.info("Unknown error: " + e.getMessage());
                return ResultGenerator.getDefaultFailResult(e.getMessage());
            }
        }
    }

}
