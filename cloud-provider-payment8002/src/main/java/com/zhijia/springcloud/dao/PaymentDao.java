package com.zhijia.springcloud.dao;

import com.zhijia.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhijia
 * @create 2022-02-28 20:22
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentByid(@Param("id") Long id);
}
