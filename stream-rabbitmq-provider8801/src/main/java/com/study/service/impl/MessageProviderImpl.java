package com.study.service.impl;

import com.study.service.IMessageProvider;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import java.util.UUID;

/**
 * @author yangz
 * @date 2022/7/1 - 11:40
 */

@Service
public class MessageProviderImpl implements IMessageProvider {
    private final StreamBridge streamBridge;

    public MessageProviderImpl(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString().substring(0, 10);
        streamBridge.send("myChannel-out-0", MessageBuilder.withPayload(serial).build());
        System.out.println("发送消息："+serial);
        return null;
    }
}
