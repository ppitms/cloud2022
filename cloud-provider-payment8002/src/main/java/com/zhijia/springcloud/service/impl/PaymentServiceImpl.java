package com.zhijia.springcloud.service.impl;

import com.zhijia.springcloud.dao.PaymentDao;
import com.zhijia.springcloud.entities.Payment;
import com.zhijia.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhijia
 * @create 2022-02-28 21:11
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource //autowired
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentByid(Long id){
        return paymentDao.getPaymentByid(id);
    }
}
