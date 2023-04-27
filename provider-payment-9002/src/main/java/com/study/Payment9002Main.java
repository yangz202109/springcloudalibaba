package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yangz
 * @date 2022/3/16 - 9:58
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment9002Main {
    public static void main(String[] args) {
        SpringApplication.run(Payment9002Main.class,args);
    }
}
