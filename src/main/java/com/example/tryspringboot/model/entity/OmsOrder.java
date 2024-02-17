package com.example.tryspringboot.model.entity;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * oms_order
 * @author 文杰
 */
@Data
public class OmsOrder implements Serializable {
    private Long id;

    private String uuid;

    private Date createAt;

    private Date updateAt;

    private Date deleteAt;

    private Integer payType;

    private Integer orderState;

    private Date payLatestTime;

    private BigDecimal postFee;

    private BigDecimal payMoney;

    private BigDecimal totalMoney;

    private Integer totalNum;

    private String skus;

    private Integer payChannel;

    private Integer countdown;

    private Long userId;

    private Long addressId;

    private Date payTime;

    private Date postTime;

    private Date receiveTime;

    private Date commentTime;

    private Date cancelTime;

    @Serial
    private static final long serialVersionUID = 1L;
}