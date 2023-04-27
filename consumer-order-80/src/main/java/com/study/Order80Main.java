package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yangz
 * @date 2022/3/16 - 10:09
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.study.feign")
public class Order80Main {
    public static void main(String[] args) {
        SpringApplication.run(Order80Main.class,args);
    }
}
