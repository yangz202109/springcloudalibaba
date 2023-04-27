package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yangz
 * @date 2022/3/16 - 13:44
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientMain {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain.class,args);
    }
}
