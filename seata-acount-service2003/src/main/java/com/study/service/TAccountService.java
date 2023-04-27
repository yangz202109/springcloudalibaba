package com.study.service;

import com.study.pojo.TAccount;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;

/**
 *
 */
public interface TAccountService extends IService<TAccount> {

    /**
     * 修改用户的余额
     * @param userId 用户id
     * @param money 　减去的金额
     * @return
     */
    int decrease(Long userId, BigDecimal money);
}
