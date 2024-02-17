package com.example.tryspringboot.model.entity;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;

/**
 * address
 * @author 文杰
 */
@Data
public class Address implements Serializable {
    private Long id;

    private String uuid;

    private LocalDateTime createAt;

    private LocalDateTime updateAt;

    private Long userId;

    private String receiver;

    private String contact;

    private String provinceCode;

    private String cityCode;

    private String countyCode;

    private String address;

    private String postalCode;

    private String addressTags;

    private Byte isDefault;

    private String fullLocation;

    @Serial
    private static final long serialVersionUID = 1L;

    public Address(String userId, String receiver, String contact, String provinceCode, String cityCode, String countyCode, String address, String postalCode, String addressTags, Byte isDefault, String fullLocation) {
        this.uuid = java.util.UUID.randomUUID().toString();
        this.createAt = LocalDateTime.now();
        this.updateAt = LocalDateTime.now();
        this.userId = Long.parseLong(userId);
        this.receiver = receiver;
        this.contact = contact;
        this.provinceCode = provinceCode;
        this.cityCode = cityCode;
        this.countyCode = countyCode;
        this.address = address;
        this.postalCode = postalCode;
        this.addressTags = addressTags;
        this.isDefault = isDefault;
        this.fullLocation = fullLocation;
    }
}