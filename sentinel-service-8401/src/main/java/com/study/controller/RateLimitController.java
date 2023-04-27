package com.study.controller;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.study.myHandler.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangz
 * @date 2022/3/18 - 8:55
 */
@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value ="byResource",blockHandler = "handleException")
    public String byResource(){
        return "按资源名称限流测试OK";
    }

    public String handleException(BlockException e){
        return e.getClass().getCanonicalName()+"\t 服务不可用";
    }

    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value ="byUrl",blockHandler = "handleException")
    public String byUrl(){
        return "按byUrl限流测试OK";
    }

    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value ="customerBlockHandler",blockHandlerClass = CustomerBlockHandler.class,blockHandler = "handlerException")
    public String customerBlockHandler(){
        return "测试客户自定义";
    }
}
