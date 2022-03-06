package com.zhijia.springcloud.service;

import com.zhijia.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhijia
 * @create 2022-02-28 21:09
 */

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentByid(@Param("id") Long id);
}
