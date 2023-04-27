package com.study.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yangz
 * @date 2022/3/22 - 8:47
 * 调用库存微服务
 */
@FeignClient(value = "storage-service")
public interface StorageFeign {

    @PostMapping("/storage/decrease")
    int decrease(@RequestParam("productId") Long productId,@RequestParam("count") Integer count);
}
