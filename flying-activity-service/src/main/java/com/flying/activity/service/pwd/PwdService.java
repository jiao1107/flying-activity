package com.flying.activity.service.pwd;

/**
 * 密码服务
 *
 * @author Feixiang.Jiao
 * @date 2022-09-21 14:20
 * @since 1.0
 */
public interface PwdService {

    /**
     * 保存密码
     *
     * @param pwd 密码信息
     * @return 保存条数
     */
    int createPwd(PwdBO pwd);

    /**
     * 修改密码
     *
     * @param account
     * @param oldPwd  旧密码
     * @param newPwd  新密码
     * @return 修改条数
     */
    int changePwd(String account, String oldPwd, String newPwd);

    /**
     * 找回密码
     *
     * @param id     id
     * @param newPwd 新密码
     * @return
     */
    int retrieve(Long id, String newPwd);

}
