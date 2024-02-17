package com.example.tryspringboot.service.intf;

import com.example.tryspringboot.model.dto.HomeCategoryResp;
import com.example.tryspringboot.model.entity.Banner;
import com.example.tryspringboot.model.entity.Goods;

import java.util.List;

/**
 * @Author: xwj
 * @Date: 2024/2/3
 * @Description:
 */
public interface HomeService {

    /**
     * 获取分类和商品
     *
     * @return 分类和商品 HomeCategoryResp
     */
    HomeCategoryResp getCategoryAndGoods();

    /**
     * 获取热门商品
     *
     * @return 热门商品 List<Goods>
     */
    List<Goods> getHotGoods();

    /**
     * 获取轮播图
     *
     * @return 轮播图 List<Banner>
     */
    List<Banner> getBanner();

}
