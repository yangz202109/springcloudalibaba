package com.study.service;

import com.study.pojo.TStorage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 */
public interface TStorageService extends IService<TStorage> {

    /**
     * 减少指定产品的数量
     * @param productId 产品id
     * @param count 库存数量
     * @return
     */
    int decrease(Long productId, Integer count);
}
