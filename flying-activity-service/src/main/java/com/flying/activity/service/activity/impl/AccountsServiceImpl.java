package com.flying.activity.service.activity.impl;

import com.flying.activity.service.activity.ActivityBO;
import com.flying.activity.service.activity.ActivityService;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

/**
 * 账号服务实现类
 *
 * @author Feixiang.Jiao
 * @date 2022-09-01 14:28
 * @since 1.0
 */
@Service
public class AccountsServiceImpl implements ActivityService {


    @Retryable
    public void create() {

    }

    @Override
    public ActivityBO register(ActivityBO accountInfo) {

        return null;
    }

    @Override
    public ActivityBO get(String account) {
        return null;
    }

    @Override
    public ActivityBO getByCondition(String account, boolean hasUserInfo) {
        return null;
    }

}
