package com.zhijia.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * @author zhijia
 * @create 2022-03-04 12:48
 */
@Service
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_ok./(ㄒoㄒ)/~~";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut./(ㄒoㄒ)/~~";
    }
}
