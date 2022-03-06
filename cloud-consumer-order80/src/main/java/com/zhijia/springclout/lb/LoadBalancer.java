package com.zhijia.springclout.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author zhijia
 * @create 2022-03-03 11:44
 */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
