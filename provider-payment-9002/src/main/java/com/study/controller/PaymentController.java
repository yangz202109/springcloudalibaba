package com.study.controller;

import com.study.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangz
 * @date 2022/3/16 - 9:59
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
    private PaymentService paymentService;
    @Autowired
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Value("${server.port}")
    private String port;

    @GetMapping("/getPort")
    public String getPort(){
        String servicePort = paymentService.getPort(this.port);
        return "本服务端口为: "+ servicePort;
    }
}
