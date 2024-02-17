package com.example.tryspringboot.constant.enums;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * @Author: xwj
 * @Date: 2024/2/16
 * @Description:
 */
@Getter
public enum UserErrorCode implements BaseErrorCode {
    /**
     * 用户密码错误
     */
    INCORRECT_PASSWORD(101000, HttpStatus.FORBIDDEN, "用户密码错误"),
    /**
     * 用户没有登录
     */
    USER_NOT_LOGIN(101001, HttpStatus.FORBIDDEN, "用户没有登录"),
    /**
     * 用户不存在
     */
    USER_NOT_FOUND(101003, HttpStatus.NOT_FOUND, "用户不存在"),
    /**
     * 用户已存在，请勿重复注册
     */
    USER_ALREADY_EXISTS(101004, HttpStatus.BAD_REQUEST, "用户已存在，请勿重复注册"),
    /**
     * token已过期
     */
    TOKEN_HAS_EXPIRED(101008, HttpStatus.FORBIDDEN, "token已过期"),
    /**
     * 无效token
     */
    INVALID_TOKEN(101009, HttpStatus.FORBIDDEN, "无效token");


    private final int code;

    private final HttpStatus status;

    private final String msg;

    UserErrorCode(int code, HttpStatus status, String msg) {
        this.code = code;
        this.status = status;
        this.msg = msg;
    }
}