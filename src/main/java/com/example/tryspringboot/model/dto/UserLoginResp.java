package com.example.tryspringboot.model.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author: xwj
 * @Date: 2024/2/15
 * @Description:
 */
@Accessors(chain = true)
@Data
public class UserLoginResp {
    /*todo:不将id暴露给前端，而是返回uuid，前端存储uuid，后端存储id和uuid的映射关系，这样可以保证用户id不被泄露
     */

    String id;
    String account;
    String mobile;
    String nickname;
    String token;

    public UserLoginResp setId(Long id) {
        this.id = String.valueOf(id);
        return this;
    }
}
