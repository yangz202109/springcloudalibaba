package com.study.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author yangz
 * @date 2022/3/18 - 9:21
 * 客户自定义限流处理逻辑类
 */
public class CustomerBlockHandler {

    public static String handlerException(BlockException e){
        return  "客户自定义global处理 o(╥﹏╥)o";
    }
}
