package com.example.tryspringboot.model.dto;

import com.example.tryspringboot.model.entity.Goods;
import lombok.Data;

import java.util.List;

/**
 * @Author: xwj
 * @Date: 2024/2/16
 * @Description:
 */
@Data
public class CategoryAndGoods {
    /**
     * 分类id
     */
    private final String id;
    /**
     * 分类名称
     */
    private final String name;
    /**
     * 分类图片
     */
    private final String picture;

    /**
     * 商品列表
     */
    private final List<Goods> goods;

    public CategoryAndGoods(String id, String name, String picture, List<Goods> goods) {
        this.id = id;
        this.name = name;
        this.picture = picture;
        this.goods = goods;
    }
}