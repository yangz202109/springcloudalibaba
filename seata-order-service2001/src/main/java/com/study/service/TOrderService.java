package com.study.service;

import com.study.domain.TOrder;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 *
 */
public interface TOrderService extends IService<TOrder> {

   //新建订单
    int create(TOrder order);

    //修改订单状态  0-->1
    int updateStatus(Long id);

}
