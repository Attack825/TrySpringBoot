package com.example.tryspringboot.service.impl;

import cn.dev33.satoken.stp.StpUtil;
import com.example.tryspringboot.constant.enums.CommonErrorCode;
import com.example.tryspringboot.constant.enums.UserErrorCode;
import com.example.tryspringboot.dao.AddressDao;
import com.example.tryspringboot.exception.CommonException;
import com.example.tryspringboot.exception.UserException;
import com.example.tryspringboot.model.dto.AddressAddReq;
import com.example.tryspringboot.model.dto.AddressUpdateReq;
import com.example.tryspringboot.model.entity.Address;
import com.example.tryspringboot.service.intf.AddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: xwj
 * @Date: 2024/2/7
 * @Description:
 */
@Service
public class AddressServiceImpl implements AddressService {
    private static final Logger logger = LoggerFactory.getLogger(AddressServiceImpl.class);
    private final AddressDao addressDao;

    @Autowired
    public AddressServiceImpl(AddressDao addressDao) {
        this.addressDao = addressDao;
    }

    @Override
    public void insertAddress(AddressAddReq addressAddReq) {
        String tokenValue = StpUtil.getTokenValue();
        String userId = (String) StpUtil.getLoginIdByToken(tokenValue);
        if (userId == null) {
            logger.debug("not login");
            throw new UserException(UserErrorCode.USER_NOT_LOGIN);
        }
        Byte isDefault = (byte) ((int) addressAddReq.getIsDefault());
        Address address = new Address(userId, addressAddReq.getReceiver(), addressAddReq.getContact(), addressAddReq.getProvinceCode(), addressAddReq.getCityCode(), addressAddReq.getCountyCode(), addressAddReq.getAddress(), addressAddReq.getPostalCode(), addressAddReq.getAddressTags(), isDefault, addressAddReq.getFullLocation());
        addressDao.insert(address);
        logger.debug("addressDao insert");
    }

    @Override
    public void deleteAddressByAddressId(String addressId) {
        String tokenValue = StpUtil.getTokenValue();
        String userId = (String) StpUtil.getLoginIdByToken(tokenValue);
        if (userId == null) {
            logger.debug("not login");
            throw new UserException(UserErrorCode.USER_NOT_LOGIN);
        }
        addressDao.deleteByPrimaryKey(Long.valueOf(addressId));
        logger.debug("deleteAddressByAddressId: " + addressId);
    }

    @Override
    public void updateAddressByAddressId(String id, AddressUpdateReq addressUpdateReq) {
        String tokenValue = StpUtil.getTokenValue();
        String userId = (String) StpUtil.getLoginIdByToken(tokenValue);
        if (userId == null) {
            logger.debug("not login");
            throw new UserException(UserErrorCode.USER_NOT_LOGIN);
        }
        if (addressDao.selectByPrimaryKey(Long.valueOf(id)) == null) {
            logger.debug("address not found");
            throw new CommonException(CommonErrorCode.ADDRESS_NOT_FOUND);
        }

        Byte isDefault = (byte) ((int) addressUpdateReq.getIsDefault());
        Address address = new Address(addressUpdateReq.getId(), addressUpdateReq.getReceiver(), addressUpdateReq.getContact(), addressUpdateReq.getProvinceCode(), addressUpdateReq.getCityCode(), addressUpdateReq.getCountyCode(), addressUpdateReq.getAddress(), addressUpdateReq.getPostalCode(), addressUpdateReq.getAddressTags(), isDefault, addressUpdateReq.getFullLocation());
        int line = addressDao.updateByPrimaryKey(address);
        logger.debug("updateAddressByAddressId line: " + line);
    }

    @Override
    public List<Address> listAddress() {
        String tokenValue = StpUtil.getTokenValue();
        String userId = (String) StpUtil.getLoginIdByToken(tokenValue);
        if (userId == null) {
            logger.debug("not login");
            throw new UserException(UserErrorCode.USER_NOT_LOGIN);
        }
        logger.debug("selectAddressByUserId");
        return addressDao.selectByUserId(Long.valueOf(userId));
    }
}
