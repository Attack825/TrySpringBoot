package com.example.tryspringboot.dao;

import com.example.tryspringboot.model.entity.Address;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 文杰
 */
@Repository
public interface AddressDao {
    /**
     * 根据id删除地址
     * @param id 地址id
     * @return 删除的行数
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入地址
     * @param record 地址
     * @return 插入的行数
     */
    int insert(Address record);

    /**
     * 选择性插入地址
     * @param record 地址
     * @return 插入的行数
     */
    int insertSelective(Address record);

    /**
     * 根据id查询地址
     * @param id 地址id
     * @return 地址
     */
    Address selectByPrimaryKey(Long id);

    /**
     * 选择性更新地址
     * @param record 地址
     * @return 更新的行数
     */
    int updateByPrimaryKeySelective(Address record);

    /**
     * 更新地址
     * @param record 地址
     * @return 更新的行数
     */
    int updateByPrimaryKey(Address record);

    /**
     * 根据用户id查询地址
     * @param userId 用户id
     * @return 地址列表
     */
    List<Address> selectByUserId(Long userId);
}