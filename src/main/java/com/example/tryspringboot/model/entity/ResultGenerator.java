package com.example.tryspringboot.model.entity;

import com.example.tryspringboot.constant.enums.CommonErrorCode;

/**
 * @author 文杰
 */
public class ResultGenerator {

    /**
     * 默认成功返回结果
     * @param data 获取的数据
     * @return Result
     */
    public static Result getDefaultSuccessResult(Object data) {
        return new Result()
                .setCode(CommonErrorCode.OK.getStatus().value())
                .setMessage(CommonErrorCode.OK.getMsg())
                .setData(data);
    }

    /**
     * 默认失败返回结果
     *
     * @return Result
     */
    public static Result getDefaultFailResult(Object data) {
        return new Result()
                .setCode(CommonErrorCode.INTERNAL_SERVER_ERROR.getStatus().value())
                .setMessage(CommonErrorCode.INTERNAL_SERVER_ERROR.getMsg())
                .setData(data);
    }

    public static Result getResult(Integer code, String message, Object data) {
        return new Result()
                .setCode(code)
                .setMessage(message)
                .setData(data);
    }
}
