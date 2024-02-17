package com.example.tryspringboot.model.entity;

import lombok.Data;

/**
 * @author 文杰
 */
@Data
public class Result {
    private Integer code;
    private String msg;
    private Object data;
    public Result setCode(Integer code){
        this.code = code;
        return this;
    }

    public Result setMessage(String message){
        this.msg = message;
        return this;
    }

    public Result setData(Object data){
        this.data = data;
        return this;
    }
}

