package com.study.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author yangz
 * @date 2022/3/17 - 10:24
 */
@RestController
@RequestMapping("/sentinel")
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        return "====testA====";
    }

    @GetMapping("/testB")
    public String testB(){
        try {
            TimeUnit.MILLISECONDS.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "====testB====";
    }

    @GetMapping("/testD")
    public String testD()
    {
       /* try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
        log.info("testD 测试RT");*/
        log.info("测试异常比例");
        int i=10/0;
        return "------testD";
    }

}
