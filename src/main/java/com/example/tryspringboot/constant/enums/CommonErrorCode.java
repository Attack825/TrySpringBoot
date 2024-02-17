package com.example.tryspringboot.constant.enums;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * @Author: xwj
 * @Date: 2024/2/16
 * @Description:
 */
@Getter
public enum CommonErrorCode implements BaseErrorCode {
    /**
     * 成功
     */
    OK(100000, HttpStatus.OK, "成功"),
    /**
     * 错误请求
     */
    BAD_REQUEST(100001, HttpStatus.BAD_REQUEST, "错误请求"),
    /**
     * 服务器异常
     */
    INTERNAL_SERVER_ERROR(100002, HttpStatus.INTERNAL_SERVER_ERROR, "服务器异常"),
    /**
     * 数据操作异常
     */
    DATA_ACCESS_ERROR(100003, HttpStatus.INTERNAL_SERVER_ERROR, "数据操作异常"),
    /**
     * 地址不存在
     */
    ADDRESS_NOT_FOUND(100004, HttpStatus.NOT_FOUND, "地址不存在"),
    ;

    private final int code;

    private final HttpStatus status;

    private final String msg;

    CommonErrorCode(int code, HttpStatus status, String msg) {
        this.code = code;
        this.status = status;
        this.msg = msg;
    }
}
