package com.flying.activity.service.lottery.records;

import lombok.Data;

/**
 * 用户信息业务类
 *
 * @author Feixiang.Jiao
 * @date 2022-09-20 14:28
 * @since 1.0
 */
@Data
public class UserBO {

    /**
     * '主键id'
     */
    private Long id;

    /**
     * '姓名'
     */
    private String name;

    /**
     * '昵称'
     */
    private String nickName;

    /**
     * '头像'
     */
    private String avatar;

    /**
     * '创建时间'
     */
    private String createTime;

    /**
     * 版本号，来是被最新的用户信息记录
     */
    private Integer version;

}
