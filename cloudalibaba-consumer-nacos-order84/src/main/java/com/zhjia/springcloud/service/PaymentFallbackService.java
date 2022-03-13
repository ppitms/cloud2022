package com.zhjia.springcloud.service;

import com.zhijia.springcloud.entities.CommonResult;
import com.zhijia.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author zhijia
 * @create 2022-03-10 20:17
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, "服务降级返回,没有该流水信息", new Payment(id, "errorSerial......"));
    }
}    