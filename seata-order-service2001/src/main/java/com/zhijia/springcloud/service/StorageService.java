package com.zhijia.springcloud.service;

import com.zhijia.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**库存
 * @author zhijia
 * @create 2022-03-11 16:12
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    //库存扣减
    @GetMapping("/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
