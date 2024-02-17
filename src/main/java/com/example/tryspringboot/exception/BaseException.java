package com.example.tryspringboot.exception;

import com.example.tryspringboot.constant.enums.BaseErrorCode;
import lombok.Getter;

/**
 * @Author: xwj
 * @Date: 2024/2/16
 * @Description:
 */
@Getter
public abstract  class BaseException  extends RuntimeException {

    private final BaseErrorCode error;

    private final Object data ;

    public BaseException(BaseErrorCode error, Object data) {
        super(error.getMsg());
        this.error = error;
        this.data=data;
    }
    protected BaseException(BaseErrorCode error, Object data, Throwable cause) {
        super(error.getMsg(), cause);
        this.error = error;
        this.data=data;
    }

    public BaseErrorCode getErrorCode() {
        return error;
    }
}
