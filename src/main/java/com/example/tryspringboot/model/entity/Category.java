package com.example.tryspringboot.model.entity;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;

/**
 * category
 * @author 文杰
 */
@Data
public class Category implements Serializable {
    private Long id;

    private String uuid;

    private LocalDateTime createAt;

    private LocalDateTime updateAt;

    private String name;

    private String img;

    @Serial
    private static final long serialVersionUID = 1L;
}