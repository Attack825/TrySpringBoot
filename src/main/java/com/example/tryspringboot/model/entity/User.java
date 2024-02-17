package com.example.tryspringboot.model.entity;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Data;

/**
 * user
 *
 * @author 文杰
 */
@Data
public class User implements Serializable {
    private Long id;

    private String uuid;

    private LocalDateTime createAt;

    private LocalDateTime updateAt;

    private String account;

    private String mobile;

    private String passwordHash;

    private String nickname;

    /**
     * 用于验证版本一致性
     */
    @Serial
    private static final long serialVersionUID = 1L;

    public User(String account, String password, String mobile, String nickname) {
        this.uuid = UUID.randomUUID().toString();
        this.createAt = LocalDateTime.now();
        this.updateAt = LocalDateTime.now();
        this.account = account;
        this.passwordHash = password;
        this.mobile = mobile;
        this.nickname = nickname;

    }
}