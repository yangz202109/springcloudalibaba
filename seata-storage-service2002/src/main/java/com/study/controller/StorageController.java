package com.study.controller;

import com.study.service.TStorageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yangz
 * @date 2022/3/22 - 9:33
 */
@RestController
public class StorageController {
    @Resource
    private TStorageService storageService;

    @PostMapping("/storage/decrease")
    int decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count){
       return storageService.decrease(productId,count);
    }
}
