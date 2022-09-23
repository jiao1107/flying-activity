package com.flying.activity.service.pwd;

import lombok.Data;

import java.util.Date;

/**
 * 密码业务类
 *
 * @author Feixiang.Jiao
 * @date 2022-09-21 12:24
 * @since 1.0
 */
@Data
public class PwdBO {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 账号主键id
     */
    private Long accountId;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐
     */
    private String salt;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 版本号，依次递增，用来记录密码修改的顺序
     */
    private Integer version;

}
