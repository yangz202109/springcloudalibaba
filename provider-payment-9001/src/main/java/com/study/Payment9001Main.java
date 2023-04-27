package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yangz
 * @date 2022/3/16 - 9:07
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment9001Main {
    public static void main(String[] args) {
        SpringApplication.run(Payment9001Main.class,args);
    }
}
