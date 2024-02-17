package com.example.tryspringboot.constant.enums;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * @Author: xwj
 * @Date: 2024/2/15
 * @Description: 错误码枚举
 */
public interface BaseErrorCode {

    /**
     * 获取错误码
     * @return int
     */
    int getCode();
    /**
     * 获取错误提示
     * @return String
     */
    String getMsg();

    /**
     * 获取错误状态
     * @return HttpStatus
     */
    HttpStatus getStatus();
}
