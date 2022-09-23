package com.flying.activity.dto;

import lombok.Data;

/**
 * 找回密码请求
 *
 * @author Feixiang.Jiao
 * @date 2022-08-22 15:51
 * @since 1.0
 */
@Data
public class PwdRetrieveReq {
    /**
     * 账号
     */
    private String account;
    /**
     * 验证手机号（和账号绑定手机号一致）
     */
    private String phone;
    /**
     * 新密码
     */
    private String newPwd;
    /**
     * 验证码
     */
    private String verificationCode;
}
