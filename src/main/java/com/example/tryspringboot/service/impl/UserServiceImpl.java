package com.example.tryspringboot.service.impl;

import cn.dev33.satoken.stp.StpUtil;
import com.example.tryspringboot.constant.enums.UserErrorCode;
import com.example.tryspringboot.dao.UserDao;
import com.example.tryspringboot.exception.UserException;
import com.example.tryspringboot.model.dto.UserLoginReq;
import com.example.tryspringboot.model.dto.UserLoginResp;
import com.example.tryspringboot.model.dto.UserRegisterReq;
import com.example.tryspringboot.model.dto.UserRegisterResp;
import com.example.tryspringboot.model.entity.User;
import com.example.tryspringboot.service.intf.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @Author: xwj
 * @Date: 2024/2/8
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserLoginResp login(UserLoginReq userLoginReq) throws UserException {
        String account = userLoginReq.getAccount();
        String password = userLoginReq.getPassword();
        User user;
        if (userDao.selectByAccount(account) == null) {
            logger.debug("user not found");
            throw new UserException(UserErrorCode.USER_NOT_FOUND);
        }
        user = userDao.selectByAccount(account);
        if (Objects.equals(user.getPasswordHash(), String.valueOf(password.hashCode()))) {
            logger.debug("service login success");
            logger.debug("user: " + user.getId());
            StpUtil.login(user.getId());
            String token = StpUtil.getTokenValue();
            return new UserLoginResp().setId(user.getId()).setAccount(user.getAccount()).setMobile(user.getMobile()).setNickname(user.getNickname()).setToken(token);
        } else {
            logger.debug("password not match");
            throw new UserException(UserErrorCode.INCORRECT_PASSWORD);
        }

    }

    @Override
    public UserRegisterResp register(UserRegisterReq userRegisterReq) throws UserException {
        String account = userRegisterReq.getAccount();
        String password = userRegisterReq.getPassword();
        String mobile = userRegisterReq.getMobile();
        String nickname = userRegisterReq.getNickname();
        if (userDao.selectByAccount(account) == null) {
            User user = new User(account, String.valueOf(password.hashCode()), mobile, nickname);
            userDao.insert(user);
            logger.debug("register success");
            return new UserRegisterResp();
        }
        logger.debug("account already exists");
        throw new UserException(UserErrorCode.USER_ALREADY_EXISTS);
    }
}
