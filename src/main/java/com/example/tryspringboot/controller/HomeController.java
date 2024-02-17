package com.example.tryspringboot.controller;

import com.example.tryspringboot.model.dto.HomeCategoryResp;
import com.example.tryspringboot.model.entity.Goods;
import com.example.tryspringboot.model.entity.Result;
import com.example.tryspringboot.model.entity.ResultGenerator;
import com.example.tryspringboot.service.intf.HomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: xwj
 * @Date: 2024/2/3
 * @Description:
 */
@RestController
@RequestMapping("/home")
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    private final HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    /**
     * 首页分类
     *
     * @return Result
     */
    @GetMapping("/category")
    public Result category() {
        logger.debug("category");
        HomeCategoryResp homeCategoryResp = homeService.getCategoryAndGoods();
        return ResultGenerator.getDefaultSuccessResult(homeCategoryResp);
    }

    /**
     * 热门商品
     *
     * @return Result
     */
    @GetMapping("/hot")
    public Result hot() {
        List<Goods> goodsList = homeService.getHotGoods();
        return ResultGenerator.getDefaultFailResult(goodsList);
    }

    /**
     * 轮播图
     *
     * @return Result
     */
    @GetMapping("/banner")
    public Result banner() {
        return ResultGenerator.getDefaultSuccessResult(homeService.getBanner());
    }


}
