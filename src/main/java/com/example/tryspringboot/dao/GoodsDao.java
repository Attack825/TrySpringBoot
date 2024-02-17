package com.example.tryspringboot.dao;

import com.example.tryspringboot.model.entity.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 文杰
 */
@Repository
public interface GoodsDao {
    /**
     * 根据id删除商品
     * @param id 商品id
     * @return 删除的行数
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入商品
     * @param record 商品
     * @return 插入的行数
     */
    int insert(Goods record);

    /**
     * 选择性插入商品
     * @param record 商品
     * @return 插入的行数
     */
    int insertSelective(Goods record);

    /**
     * 根据id查询商品
     * @param id 商品id
     * @return 商品
     */
    Goods selectByPrimaryKey(Long id);

    /**
     * 选择性更新商品
     * @param record 商品
     * @return 更新的行数
     */
    int updateByPrimaryKeySelective(Goods record);

    /**
     * 更新商品
     * @param record 商品
     * @return 更新的行数
     */
    int updateByPrimaryKey(Goods record);
    /**
     * 根据分类id查询商品
     * @param categoryId 分类id
     * @return 商品列表
     */
    List<Goods> selectByCategoryId(Long categoryId);
}