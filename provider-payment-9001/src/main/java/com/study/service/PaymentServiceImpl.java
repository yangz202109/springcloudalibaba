package com.study.service;

import org.springframework.stereotype.Service;

/**
 * @author yangz
 * @date 2022/3/16 - 9:31
 */
@Service
public class PaymentServiceImpl implements PaymentService{
    @Override
    public String getPort(String str) {
        return str;
    }
}
