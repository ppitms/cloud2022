package com.zhijia.springcloud.service;

import com.zhijia.springcloud.entities.CommonResult;
import com.zhijia.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zhijia
 * @create 2022-03-03 15:37
 */
@Service
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);

    //超时业务
    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout();

}
