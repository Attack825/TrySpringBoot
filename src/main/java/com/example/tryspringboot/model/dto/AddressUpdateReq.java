package com.example.tryspringboot.model.dto;

import lombok.Data;

/**
 * @Author: xwj
 * @Date: 2024/2/16
 * @Description:
 */

@Data
public class AddressUpdateReq {
    private String id;
    private String receiver;
    private String contact;
    private String provinceCode;
    private String cityCode;
    private String countyCode;
    private String address;
    private String postalCode;
    private String addressTags;
    private Integer isDefault;
    private String fullLocation;
}
