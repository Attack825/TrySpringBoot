package com.example.tryspringboot.model.dto;

import lombok.Data;

/**
 * @Author: xwj
 * @Date: 2024/2/15
 * @Description:
 */
@Data
public class UserRegisterReq {
    String account;
    String password;
    String mobile;
    String nickname;
    public UserRegisterReq(String account, String password, String mobile, String nickname) {
        this.account = account;
        this.password = password;
        this.mobile = mobile;
        this.nickname = nickname;
    }
}
