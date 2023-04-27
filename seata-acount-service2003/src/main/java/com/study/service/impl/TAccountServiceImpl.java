package com.study.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.pojo.TAccount;
import com.study.service.TAccountService;
import com.study.mapper.TAccountMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 *
 */
@Service
public class TAccountServiceImpl extends ServiceImpl<TAccountMapper, TAccount>
    implements TAccountService{

    @Resource
    private TAccountMapper accountMapper;

    @Override
    public int decrease(Long userId, BigDecimal money) {
        UpdateWrapper<TAccount> wrapper=new UpdateWrapper<>();
        wrapper.eq("user_id",userId)
                .set("total",11);
        return accountMapper.update(null,wrapper);
    }
}




