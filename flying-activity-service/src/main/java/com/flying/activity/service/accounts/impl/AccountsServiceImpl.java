package com.flying.activity.service.accounts.impl;

import com.flying.activity.service.accounts.AccountBO;
import com.flying.activity.service.accounts.AccountsService;
import org.springframework.retry.annotation.Retryable;

/**
 * 账号服务实现类
 *
 * @author Feixiang.Jiao
 * @date 2022-09-01 14:28
 * @since 1.0
 */
public class AccountsServiceImpl implements AccountsService {


    @Retryable
    public void create() {

    }

    @Override
    public AccountBO register(AccountBO accountInfo) {

        return null;
    }

    @Override
    public AccountBO get(String account) {
        return null;
    }

    @Override
    public AccountBO getByCondition(String account, boolean hasUserInfo) {
        return null;
    }

}
