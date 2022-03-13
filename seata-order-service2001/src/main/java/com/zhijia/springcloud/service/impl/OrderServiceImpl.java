package com.zhijia.springcloud.service.impl;

import com.zhijia.springcloud.dao.OrderDao;
import com.zhijia.springcloud.domain.Order;
import com.zhijia.springcloud.service.AccountService;
import com.zhijia.springcloud.service.OrderService;
import com.zhijia.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**订单
 * @author zhijia
 * @create 2022-03-11 16:13
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;

    @Override
    @GlobalTransactional
    public void create(Order order) {
        //1、新建订单
        log.info("--------->开始新建订单");
        orderDao.create(order);

        //2、扣减库存
        log.info("--------->订单微服务开始调用库存。做扣减 数量");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("--------->订单微服务开始调用库存。做扣减结束");

        //3、扣减账户
        log.info("--------->订单微服务开始调用账户。做扣减 金额");
        accountService.decrease(order.getProductId(),order.getMoney());
        log.info("--------->订单微服务开始调用账户。做扣减结束");

        //4、修改订单状态 0 -> 1
        log.info("--------->修改订单状态开始");
        orderDao.update(order.getUserId(),0);
        log.info("--------->修改订单状态结束");

        log.info("--------->下订单结束，O(∩_∩)O哈哈~");
    }
}
