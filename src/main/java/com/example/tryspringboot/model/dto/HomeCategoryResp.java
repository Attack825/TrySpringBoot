package com.example.tryspringboot.model.dto;

import com.example.tryspringboot.model.entity.Category;
import com.example.tryspringboot.model.entity.Goods;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xwj
 * @Date: 2024/2/16
 * @Description:
 */
@Data
public class HomeCategoryResp {
    private List<CategoryAndGoods> categoryAndGoods = new ArrayList<>();

    public void addCategoryAndGoods(Category category, List<Goods> goodsList) {
        this.categoryAndGoods.add(new CategoryAndGoods(category.getId().toString(), category.getName(), category.getImg(), goodsList));
    }
}
