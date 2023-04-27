package com.study.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yangz
 * @date 2022/3/16 - 10:26
 * 调用服务提供端,在feign层同一进行fallback
 */
@FeignClient(value = "nacos-payment-provider",fallback =PaymentFeignImpl.class )
public interface PaymentFeign {
    @GetMapping("/payment/getPort")
    String getPort();
}
