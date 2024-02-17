package com.example.tryspringboot.constant.enums;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * @Author: xwj
 * @Date: 2024/2/16
 * @Description:
 */
@Getter
public enum ServiceErrorCode {
    /**
     * 成功
     */
    OK(100000, HttpStatus.OK, "成功"),
    ;

    private final int code;

    private final HttpStatus status;

    private final String msg;

    ServiceErrorCode (int code, HttpStatus status, String msg) {
        this.code = code;
        this.status = status;
        this.msg = msg;
    }

}
