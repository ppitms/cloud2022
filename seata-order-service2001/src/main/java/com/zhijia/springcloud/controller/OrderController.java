package com.zhijia.springcloud.controller;

import com.zhijia.springcloud.domain.CommonResult;
import com.zhijia.springcloud.domain.Order;
import com.zhijia.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhijia
 * @create 2022-03-11 16:39
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
