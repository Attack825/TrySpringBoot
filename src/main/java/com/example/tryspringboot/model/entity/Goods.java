package com.example.tryspringboot.model.entity;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * goods
 * @author 文杰
 */
@Data
public class Goods implements Serializable {
    private Long id;

    private String uuid;

    private Date createAt;

    private Date updateAt;

    private Date deleteAt;

    private String name;

    private BigDecimal oldPrice;

    private BigDecimal newPrice;

    private BigDecimal discount;

    private Integer stock;

    private Integer sales;

    private String title;

    private String content;

    private String imgList;

    private String certificatePossessor;

    private String categoryId;

    private String certificateId;

    private String address;

    private Integer isEffective;

    @Serial
    private static final long serialVersionUID = 1L;
}