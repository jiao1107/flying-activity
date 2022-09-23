package com.flying.activity.dto;

import lombok.Data;

/**
 * 验证码发送请求
 *
 * @author Feixiang.Jiao
 * @date 2022-08-22 14:51
 * @since 1.0
 */
@Data
public class VerificationCodeReq {
    /**
     * 手机号
     */
    private String phone;
    /**
     * 场景：register/login/change/retrieve
     */
    private String type;
}
