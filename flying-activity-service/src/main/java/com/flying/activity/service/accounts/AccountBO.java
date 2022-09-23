package com.flying.activity.service.accounts;

import com.flying.activity.common.enums.AccountType;
import com.flying.activity.service.users.UserBO;
import lombok.Data;

/**
 * 账户信息BO
 *
 * @author Feixiang.Jiao
 * @date 2022-09-13 16:03
 * @since
 */
@Data
public class AccountBO {

    /**
     * '主键id'
     */
    private Long id;

    /**
     * 账号，目前主要使用手机号即可
     */
    private String account;

    /**
     * 枚举，主账号/副账号
     */
    private AccountType type;

    /**
     * 密码
     */
    private String password;

    /**
     * 关联的用户信息
     */
    private UserBO user;

}
