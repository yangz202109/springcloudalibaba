package com.study.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.pojo.TStorage;
import com.study.service.TStorageService;
import com.study.mapper.TStorageMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 */
@Service
public class TStorageServiceImpl extends ServiceImpl<TStorageMapper, TStorage>
    implements TStorageService{

    @Resource
    private TStorageMapper storageMapper;

    @Override
    public int decrease(Long productId, Integer count) {
        UpdateWrapper<TStorage> wrapper=new UpdateWrapper<>();
        wrapper.eq("product_id",productId);
        return 0;
    }
}




