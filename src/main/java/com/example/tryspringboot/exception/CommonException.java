package com.example.tryspringboot.exception;

import com.example.tryspringboot.constant.enums.CommonErrorCode;

/**
 * @Author: xwj
 * @Date: 2024/2/16
 * @Description:
 */
public class CommonException extends BaseException {

    public CommonException(CommonErrorCode errorCode, Object data) {
        super(errorCode, data);
    }

    public CommonException(CommonErrorCode errorCode) {
        super(errorCode, null);
    }
}
