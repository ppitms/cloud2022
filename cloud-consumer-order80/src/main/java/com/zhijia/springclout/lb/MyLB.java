package com.zhijia.springclout.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**轮询算法
 * @author zhijia
 * @create 2022-03-03 11:48
 */
@Component
public class MyLB implements LoadBalancer {

    //原子类
    private AtomicInteger atomicInteger=new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do{
            current=atomicInteger.get();
            next=(current==2147483647?0:current+1);
        }while (!atomicInteger.compareAndSet(current,next));
        System.out.println("**/******第次 "+next+" 访问");
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int next = getAndIncrement();
        int i = next % serviceInstances.size();
        return serviceInstances.get(i);
    }
}
