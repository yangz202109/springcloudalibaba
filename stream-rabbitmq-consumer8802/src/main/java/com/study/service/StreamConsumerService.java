package com.study.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import java.util.function.Consumer;

@Service
@Slf4j
public class StreamConsumerService {
    @Bean
    public Consumer<String> myChannel() {
        return message -> log.info("消息："+message);
    }
}