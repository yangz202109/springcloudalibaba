package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yangz
 * @date 2022/3/17 - 10:22
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelMain {
    public static void main(String[] args) {
        SpringApplication.run(SentinelMain.class,args);
    }
}
