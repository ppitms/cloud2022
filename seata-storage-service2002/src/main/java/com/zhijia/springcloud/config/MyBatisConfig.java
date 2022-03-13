package com.zhijia.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhijia
 * @create 2022-03-11 16:54
 */
@Configuration
@MapperScan({"com.zhijia.springcloud.dao"})
public class MyBatisConfig {
}