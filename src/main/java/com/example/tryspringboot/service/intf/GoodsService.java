package com.example.tryspringboot.service.intf;

import com.example.tryspringboot.model.entity.Goods;


/**
 * @Author: xwj
 * @Date: 2024/2/3
 * @Description:
 */


public interface GoodsService {
    /**
     * 根据id查询商品
     * @param id 商品id
     * @return 商品 Goods
     */
    Goods selectById(String id);

}
