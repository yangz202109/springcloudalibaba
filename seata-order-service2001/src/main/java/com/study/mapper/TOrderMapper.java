package com.study.mapper;
import org.apache.ibatis.annotations.Param;

import com.study.domain.TOrder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

/**
 * @Entity com.study.domain.TOrder
 */
public interface TOrderMapper extends BaseMapper<TOrder> {

    int insertAll(TOrder tOrder);
}




