package com.example.tryspringboot.service.impl;

import com.example.tryspringboot.controller.UserController;
import com.example.tryspringboot.dao.GoodsDao;
import com.example.tryspringboot.model.entity.Goods;
import com.example.tryspringboot.service.intf.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: xwj
 * @Date: 2024/2/3
 * @Description:
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    private static final Logger logger = LoggerFactory.getLogger(GoodsServiceImpl.class);
    private final GoodsDao goodsDao;
    @Autowired
    public GoodsServiceImpl(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    @Override
    public Goods selectById(String id) {
        logger.info("根据id查询商品，商品id为："+id);
//        将id转换为long类型
        return goodsDao.selectByPrimaryKey(Long.parseLong(id));
    }
}
