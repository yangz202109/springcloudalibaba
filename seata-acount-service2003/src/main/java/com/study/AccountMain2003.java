package com.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yangz
 * @date 2022/3/22 - 9:31
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.study.mapper")
public class AccountMain2003 {
    public static void main(String[] args) {
        SpringApplication.run(AccountMain2003.class,args);
    }
}
