package com.example.tryspringboot.mapper;

import com.example.tryspringboot.dao.GoodsDao;
import org.junit.jupiter.api.Test;
import com.example.tryspringboot.model.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author: xwj
 * @Date: 2024/2/5
 * @Description:
 */
@SpringBootTest
class GoodsDaoTest {
    @Autowired
    private GoodsDao goodsDao;
}