package com.flying.activity.service.integration;

import com.flying.activity.service.users.UserRegisterEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;

/**
 * 优惠券服务
 *
 * @author Feixiang.Jiao
 * @date 2022-09-01 14:21
 * @since 1.0
 */
public class CouponService {

    private Logger logger = LoggerFactory.getLogger(CouponService.class);


    @EventListener
    public void sendCoupon(UserRegisterEvent registerEvent) {
        logger.info("------------------------发送优惠券收到用户注册事件，发送优惠券中");
    }


}
