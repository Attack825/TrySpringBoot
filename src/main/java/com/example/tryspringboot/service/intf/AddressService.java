package com.example.tryspringboot.service.intf;

import com.example.tryspringboot.model.dto.AddressAddReq;
import com.example.tryspringboot.model.dto.AddressUpdateReq;
import com.example.tryspringboot.model.entity.Address;

import java.util.List;

/**
 * @Author: xwj
 * @Date: 2024/2/7
 * @Description:
 */
public interface AddressService {
    /**
     * 添加地址
     *
     * @param addressAddReq 地址
     */
    void insertAddress(AddressAddReq addressAddReq);

    /**
     * 根据地址id删除地址
     *
     * @param addressId 地址id
     */
    void deleteAddressByAddressId(String addressId);

    /**
     * 根据地址id更新地址
     * @param id 地址id
     * @param addressUpdateReq 地址
     */
    void updateAddressByAddressId(String id , AddressUpdateReq addressUpdateReq);

    /**
     * 根据用户id查询地址
     *
     * @param id 用户id
     * @return 地址列表
     */

    List<Address> listAddress();
}
