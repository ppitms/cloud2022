package com.zhijia.springcloud.service;

import com.zhijia.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**账户
 * @author zhijia
 * @create 2022-03-11 16:12
 */
@FeignClient("seata-account-service")
public interface AccountService {

    //账户扣减
    @PostMapping("/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
