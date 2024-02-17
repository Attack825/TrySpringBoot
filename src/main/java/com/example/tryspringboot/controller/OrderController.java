package com.example.tryspringboot.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.example.tryspringboot.model.entity.Result;
import com.example.tryspringboot.model.entity.ResultGenerator;
import com.example.tryspringboot.service.intf.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: xwj
 * @Date: 2024/2/7
 * @Description:
 */

@RestController()
@RequestMapping("/member")
public class OrderController {
    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("order/gen") //生成订单
    public Result pre() {
        String tokenValue = StpUtil.getTokenValue();
        String userId = (String) StpUtil.getLoginIdByToken(tokenValue);
        if (userId == null) {
            return ResultGenerator.getDefaultFailResult("用户未登录");
        }
//        orderService.genOrder(userId);
        return null;
    }

    @GetMapping("order/{id}")
    public String orderById(@PathVariable String id) {
        return "order";
    }

    @GetMapping("order/pay")
    public String pay() {
        return "pay";
    }

    @PostMapping("/order") //提交订单(准备开始支付)
    public Result order() {
        String tokenValue = StpUtil.getTokenValue();
        String userId = (String) StpUtil.getLoginIdByToken(tokenValue);
        if (userId == null) {
            return ResultGenerator.getDefaultFailResult("用户未登录");
        }
        logger.debug("order: userId = " + userId);
        return ResultGenerator.getDefaultSuccessResult("order");
    }
}
