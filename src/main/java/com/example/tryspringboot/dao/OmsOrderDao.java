package com.example.tryspringboot.dao;

import com.example.tryspringboot.model.entity.OmsOrder;
import org.springframework.stereotype.Repository;

/**
 * @author 文杰
 */
@Repository
public interface OmsOrderDao {
    /**
     * 根据id删除订单
     * @param id 订单id
     * @return 删除的行数
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入订单
     * @param record 订单
     * @return 插入的行数
     */
    int insert(OmsOrder record);

    /**
     * 选择性插入订单
     * @param record 订单
     * @return 插入的行数
     */
    int insertSelective(OmsOrder record);

    /**
     * 根据id查询订单
     * @param id 订单id
     * @return 订单
     */
    OmsOrder selectByPrimaryKey(Long id);

    /**
     * 选择性更新订单
     * @param record 订单
     * @return 更新的行数
     */
    int updateByPrimaryKeySelective(OmsOrder record);

    /**
     * 更新订单
     * @param record 订单
     * @return 更新的行数
     */
    int updateByPrimaryKey(OmsOrder record);
}