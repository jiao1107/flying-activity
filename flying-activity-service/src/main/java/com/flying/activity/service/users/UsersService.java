package com.flying.activity.service.users;

/**
 * 用户服务实现
 *
 * @author Feixiang.Jiao
 * @date 2022-09-01 14:14
 * @since 1.0
 */

public interface UsersService {

    /**
     * 注册逻辑中，操作用户相关的能力，这样的操作，主要是为了解耦
     *
     * @param user 用户信息
     */
    void register(UserBO user);

}
