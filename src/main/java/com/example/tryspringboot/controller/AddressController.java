package com.example.tryspringboot.controller;

import com.example.tryspringboot.constant.enums.CommonErrorCode;
import com.example.tryspringboot.constant.enums.UserErrorCode;
import com.example.tryspringboot.exception.CommonException;
import com.example.tryspringboot.exception.UserException;
import com.example.tryspringboot.model.dto.AddressAddReq;
import com.example.tryspringboot.model.dto.AddressUpdateReq;
import com.example.tryspringboot.model.entity.Address;
import com.example.tryspringboot.model.entity.Result;
import com.example.tryspringboot.model.entity.ResultGenerator;
import com.example.tryspringboot.service.intf.AddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: xwj
 * @Date: 2024/2/3
 * @Description:
 */
@RestController()
@RequestMapping("/member")
public class AddressController {

    private static final Logger logger = LoggerFactory.getLogger(AddressController.class);
    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    /**
     * 获取地址
     *
     * @return Result
     */
    @GetMapping("/address")
    public Result getAddress() {
        List<Address> addressList = null;
        try {
            addressList = addressService.listAddress();
        } catch (UserException e) {
            if (e.getErrorCode() == UserErrorCode.USER_NOT_LOGIN) {
                logger.debug("addAddress: " + e.getMessage());
                return ResultGenerator.getResult(e.getErrorCode().getStatus().value(), e.getMessage(), null);

            }
        }
        if (addressList == null) {
            return ResultGenerator.getResult(200, "地址为空", null);
        }
        return ResultGenerator.getDefaultSuccessResult(addressList);
    }
    
    /**
     * 添加地址
     *
     * @param addressAddReq 地址
     * @return Result
     */
    @PostMapping("/address")
    public Result addAddress(@RequestBody AddressAddReq addressAddReq) {
        try {
            addressService.insertAddress(addressAddReq);
        } catch (UserException e) {
            if (e.getErrorCode() == UserErrorCode.USER_NOT_LOGIN) {
                logger.debug("addAddress: " + e.getMessage());
                return ResultGenerator.getResult(e.getErrorCode().getStatus().value(), e.getMessage(), null);

            }
        }
        logger.info("addAddress success");
        return ResultGenerator.getDefaultSuccessResult(null);
    }

    /**
     * 删除地址
     *
     * @param id 地址id
     * @return Result
     */
    @DeleteMapping("/address/{id}")
    public Result deleteAddress(@PathVariable String id) {
        try {
            addressService.deleteAddressByAddressId(id);
        } catch (UserException e) {
            if (e.getErrorCode() == UserErrorCode.USER_NOT_LOGIN) {
                logger.debug("deleteAddress: " + e.getMessage());
                return ResultGenerator.getResult(e.getErrorCode().getStatus().value(), e.getMessage(), null);
            }
        }
        return ResultGenerator.getDefaultSuccessResult(null);
    }

    /**
     * 修改地址
     *
     * @param id               用户id
     * @param addressUpdateReq 地址
     * @return Result
     */
    @PutMapping("/address/{id}")
    public Result updateAddress(@PathVariable String id, @RequestBody AddressUpdateReq addressUpdateReq) {
        try {
            addressService.updateAddressByAddressId(id, addressUpdateReq);
        } catch (UserException e) {
            if (e.getErrorCode() == UserErrorCode.USER_NOT_LOGIN) {
                logger.debug("updateAddress: " + e.getMessage());
                return ResultGenerator.getResult(e.getErrorCode().getStatus().value(), e.getMessage(), null);
            }
        } catch (CommonException e) {
            if (e.getErrorCode() == CommonErrorCode.ADDRESS_NOT_FOUND) {
                logger.debug("updateAddress: " + e.getMessage());
                return ResultGenerator.getResult(e.getErrorCode().getStatus().value(), e.getMessage(), null);
            }
        }
        return ResultGenerator.getDefaultSuccessResult(null);
    }


}
