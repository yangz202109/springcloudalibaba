package com.study.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.study.feign.PaymentFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yangz
 * @date 2022/3/16 - 10:29
 */
@RestController
public class OrderController {
    @Resource
    private PaymentFeign paymentFeign;

    @GetMapping("/consumer/getPort")
    @SentinelResource(value = "fallback",fallback = "handler")
    public String getPort(){
        String port = paymentFeign.getPort();
        int i=10/0;
        return port;
    }
    public String handler(Throwable e){
        return e.getClass().getCanonicalName()+"=服务内部发生异常";
    }

    @GetMapping("/consumer/getPort2")
    public String getPort2(){
        String port = paymentFeign.getPort();
        return port;
    }
}
