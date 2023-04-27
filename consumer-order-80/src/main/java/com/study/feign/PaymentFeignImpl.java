package com.study.feign;

import org.springframework.stereotype.Component;

/**
 * @author yangz
 * @date 2022/3/18 - 10:43
 *
 */
@Component
public class PaymentFeignImpl implements PaymentFeign{
    @Override
    public String getPort() {
        return "服务降级不可用";
    }
}
