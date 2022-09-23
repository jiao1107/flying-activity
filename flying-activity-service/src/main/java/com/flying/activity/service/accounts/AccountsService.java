package com.flying.activity.service.accounts;

/**
 * 账户服务
 *
 * @author Feixiang.Jiao
 * @date 2022-09-01 14:10
 * @since 1.0
 */
public interface AccountsService {

    /**
     * 注册
     *
     * @param accountInfo 账户信息
     * @return 账号信息
     */
    AccountBO register(AccountBO accountInfo);

    /**
     * 获取账号信息（包含密码和用户信息）
     *
     * @param account 账号
     * @return 账号信息
     */
    AccountBO get(String account);

    /**
     * 根据条件要求，获取账户信息
     *
     * @param account     账号
     * @param hasUserInfo 是否包含用户信息，默认false
     * @return 账号信息
     */
    AccountBO getByCondition(String account, boolean hasUserInfo);

}
