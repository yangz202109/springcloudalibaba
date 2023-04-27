package com.study.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.domain.TOrder;
import com.study.service.TOrderService;
import com.study.mapper.TOrderMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 *
 */
@Service
public class TOrderServiceImpl extends ServiceImpl<TOrderMapper, TOrder> implements TOrderService{
    @Resource
    private TOrderMapper orderMapper;

    @Override
    public int create(TOrder order) {
        order.setStatus(0);
        return orderMapper.insert(order);
    }

    @Override
    public int updateStatus(Long id) {
        UpdateWrapper<TOrder> wrapper=new UpdateWrapper<>();
        wrapper.eq("id",id)
                .set("status",1);
        return 0;
    }
}




