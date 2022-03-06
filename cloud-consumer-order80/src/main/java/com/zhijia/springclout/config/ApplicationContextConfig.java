package com.zhijia.springclout.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhijia
 * @create 2022-03-01 10:19
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced  //负载均衡
    public RestTemplate getRstTemplate(){
        return new RestTemplate();
    }
}
