package com.flying.activity.service.lottery.records.impl;

import com.flying.activity.service.lottery.records.UserBO;
import com.flying.activity.service.lottery.records.UserRegisterEvent;
import com.flying.activity.service.lottery.records.UsersService;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * 用户服务实现
 *
 * @author Feixiang.Jiao
 * @date 2022-09-20 14:25
 * @since 1.0
 */
@Service
public class UsersServiceImpl implements UsersService, ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;


    @Override
    public void register(UserBO user) {

        String account = null;
        // 将用户注册成功的事件，推送spring事件中，其他监听该事件的服务，直接消费事件即可
        applicationEventPublisher.publishEvent(new UserRegisterEvent(this, account));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

}
