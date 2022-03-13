package com.zhijia.springcloud.service;

import org.apache.ibatis.annotations.Param;

/**
 * @author zhijia
 * @create 2022-03-11 21:24
 */
public interface StorageService {

    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
