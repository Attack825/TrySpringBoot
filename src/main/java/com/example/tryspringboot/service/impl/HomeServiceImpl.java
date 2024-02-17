package com.example.tryspringboot.service.impl;

import com.example.tryspringboot.dao.BannerDao;
import com.example.tryspringboot.dao.CategoryDao;
import com.example.tryspringboot.model.dto.HomeCategoryResp;
import com.example.tryspringboot.model.entity.Category;
import com.example.tryspringboot.dao.GoodsDao;
import com.example.tryspringboot.model.entity.Banner;
import com.example.tryspringboot.model.entity.Goods;
import com.example.tryspringboot.service.intf.HomeService;
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
public class HomeServiceImpl implements HomeService {
    private static final Logger logger = LoggerFactory.getLogger(HomeServiceImpl.class);
    private final GoodsDao goodsDao;
    private final CategoryDao categoryDao;
    private final BannerDao bannerDao;

    @Autowired
    public HomeServiceImpl(GoodsDao goodsDao, CategoryDao categoryDao, BannerDao bannerDao) {
        this.goodsDao = goodsDao;
        this.categoryDao = categoryDao;
        this.bannerDao = bannerDao;
    }

    @Override
    public HomeCategoryResp getCategoryAndGoods() {
        List<Category> categoryList = categoryDao.selectAll();
        logger.debug("categoryList: {}", categoryList);
        HomeCategoryResp homeCategoryResp = new HomeCategoryResp();
        for (Category category : categoryList) {
            List<Goods> goodsList = goodsDao.selectByCategoryId(category.getId());
            homeCategoryResp.addCategoryAndGoods(category, goodsList);
        }
        return homeCategoryResp;
    }


    @Override
    public List<Goods> getHotGoods() {
        return null;
    }


    @Override
    public List<Banner> getBanner() {
        List<Banner> bannerList = bannerDao.selectAll();
        logger.debug("bannerList: {}", bannerList);
        return bannerList;
    }
}
