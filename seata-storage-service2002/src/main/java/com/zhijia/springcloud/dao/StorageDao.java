package com.zhijia.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhijia
 * @create 2022-03-11 21:08
 */
@Mapper
public interface StorageDao {

    //库存扣减
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
