package com.zhijia.springcloud.domain;

import lombok.Data;

/**
 * @author zhijia
 * @create 2022-03-11 21:07
 */
@Data
public class Storage {
    private Long id;
    /**
     * 产品id
     */
    private Long productId;
    /**
     * 总库存
     */
    private Integer total;
    /**
     * 已用库存
     */
    private Integer used;
    /**
     * 剩余库存
     */
    private Integer residue;
}