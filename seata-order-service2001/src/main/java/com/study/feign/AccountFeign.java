package com.study.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author yangz
 * @date 2022/3/22 - 9:14
 * 调用账号微服务
 */
@FeignClient(value = "account-service")
public interface AccountFeign {

    @PostMapping("/account/decrease")
    int decrease(@RequestParam("userId") Long userId,@RequestParam("money") BigDecimal money);
}
