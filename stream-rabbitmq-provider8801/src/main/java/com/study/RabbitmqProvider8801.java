package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yangz
 * @date 2022/7/1 - 10:43
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RabbitmqProvider8801 {
    public static void main(String[] args) {
        SpringApplication.run(RabbitmqProvider8801.class,args);
    }
}
