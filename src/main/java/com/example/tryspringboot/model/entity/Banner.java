package com.example.tryspringboot.model.entity;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * banner
 * @author 文杰
 */
@Data
public class Banner implements Serializable {
    private Long id;

    private String uuid;

    private LocalDateTime createAt;

    private LocalDateTime updateAt;

    private String imgUrl;

    private String hrefUrl;

    private String type;

    @Serial
    private static final long serialVersionUID = 1L;
}