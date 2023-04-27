package com.study.controller;

import com.study.service.TAccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author yangz
 * @date 2022/3/22 - 9:35
 */
@RestController
public class AccountController {
    @Resource
    private TAccountService accountService;

    @PostMapping("/account/decrease")
    int decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money){
       return accountService.decrease(userId,money);
    }
}
