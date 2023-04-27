package com.study.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangz
 * @date 2022/3/16 - 13:46
 */
@RestController
@RefreshScope //之处nacos的动态刷新
public class ConfigClientController {
    @Value("${config.info}")  //根据配置中心的指定dataId的配置数据
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo(){
        return configInfo;
    }
}
