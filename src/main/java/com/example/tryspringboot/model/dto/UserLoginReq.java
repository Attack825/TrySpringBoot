package com.example.tryspringboot.model.dto;

import lombok.Data;

/**
 * @Author: xwj
 * @Date: 2024/2/15
 * @Description:
 */
@Data
public class UserLoginReq {
    String account;
    String password;

    /**
     * 构造函数
     * @param account 用户账号
     * @param password 用户密码
     */
    public UserLoginReq(String account, String password) {
        this.account = account;
        this.password = password;
    }
}
