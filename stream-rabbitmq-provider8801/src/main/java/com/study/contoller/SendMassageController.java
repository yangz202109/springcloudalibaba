package com.study.contoller;

import com.study.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangz
 * @date 2022/7/1 - 14:18
 */
@RestController
public class SendMassageController {
    private final IMessageProvider messageProvider;

    public SendMassageController(IMessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @GetMapping(value = "/rabbitmq/send")
    public String sendMassage(){
        return messageProvider.send();
    }
}
