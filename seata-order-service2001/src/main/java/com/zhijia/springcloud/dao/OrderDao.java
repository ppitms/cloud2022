package com.zhijia.springcloud.dao;

import com.zhijia.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhijia
 * @create 2022-03-11 15:43
 */
@Mapper
public interface OrderDao {
    //1、新建订单
    void create(Order order);

    //2、修改订单状态
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}
