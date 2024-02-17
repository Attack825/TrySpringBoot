package com.example.tryspringboot.controller;

import com.example.tryspringboot.model.entity.Goods;
import com.example.tryspringboot.model.entity.Result;
import com.example.tryspringboot.model.entity.ResultGenerator;
import com.example.tryspringboot.service.intf.GoodsService;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: xwj
 * @Date: 2024/2/3
 * @Description:
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {
    private static final Logger logger = LoggerFactory.getLogger(GoodsController.class);
    private final GoodsService goodsService;

    @Autowired
    public GoodsController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }


    /**
     * 商品详情
     * @param id 商品id
     * @return Result
     */
    @GetMapping("")
    public Result goods(@RequestParam("id") String id) {
        logger.info("商品详情，商品id为："+id);
        Goods goods = goodsService.selectById(id);
        return ResultGenerator.getDefaultSuccessResult(goods);
    }

}
