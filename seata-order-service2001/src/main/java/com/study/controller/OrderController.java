package com.study.controller;

import com.study.domain.TOrder;
import com.study.feign.AccountFeign;
import com.study.feign.StorageFeign;
import com.study.service.TOrderService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * @author yangz
 * @date 2022/3/18 - 17:20
 */
@RestController
@Slf4j
public class OrderController {
    @Resource
    private TOrderService orderService;
    @Resource
    private AccountFeign accountFeign;
    @Resource
    private StorageFeign storageFeign;

    @PostMapping("/order/shopping")
    @GlobalTransactional(name = "create-order",rollbackFor = Exception.class)
    public String shopping(TOrder order){
        log.info("--------->开始创建订单");
        orderService.create(order);

        log.info("--------->调用库存微服务,做扣减库存数量");
        storageFeign.decrease(order.getProductId(),order.getCount());

        log.info("-------->调用账号微服务,洲扣减余额");
        accountFeign.decrease(order.getUserId(),order.getMoney());

        log.info("---------->上面操作成功,修改订单状态");
        orderService.updateStatus(order.getId());

        return "下单成功,请耐心等待O(∩_∩)O";
    }

}
