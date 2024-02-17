package com.example.tryspringboot.exception;

import com.example.tryspringboot.constant.enums.UserErrorCode;
import lombok.Getter;

/**
 * @Author: xwj
 * @Date: 2024/2/16
 * @Description:
 */
public class UserException extends BaseException {

    public UserException(UserErrorCode errorCode, Object data) {
        super(errorCode, data);
    }

    public UserException(UserErrorCode errorCode) {
        super(errorCode, null);
    }
}
