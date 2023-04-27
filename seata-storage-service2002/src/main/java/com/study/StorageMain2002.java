package com.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yangz
 * @date 2022/3/22 - 8:59
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.study.mapper")
public class StorageMain2002 {
    public static void main(String[] args) {
        SpringApplication.run(StorageMain2002.class,args);
    }
}
