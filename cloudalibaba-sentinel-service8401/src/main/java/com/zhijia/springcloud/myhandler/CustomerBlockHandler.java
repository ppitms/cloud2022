package com.zhijia.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zhijia.springcloud.entities.CommonResult;

/**
 * @author zhijia
 * @create 2022-03-10 14:59
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(444, "按客户自定义的，global handlerException---01");
    }
    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(444, "按客户自定义的，global handlerException---02");
    }
}
