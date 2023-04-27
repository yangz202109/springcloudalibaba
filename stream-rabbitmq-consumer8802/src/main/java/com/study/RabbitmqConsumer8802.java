package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yangz
 * @date 2022/7/1 - 16:07
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RabbitmqConsumer8802 {
    public static void main(String[] args) {
        SpringApplication.run(RabbitmqConsumer8802.class,args);
    }
}
