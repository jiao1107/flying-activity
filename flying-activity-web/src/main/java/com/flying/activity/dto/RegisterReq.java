package com.flying.activity.dto;

import com.flying.activity.checker.Register;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 注册请求参数
 *
 * @author Feixiang.Jiao
 * @date 2022-08-22 13:54
 * @since 1.0
 */
@Data
public class RegisterReq {
    /**
     * 账号
     */
    @NotBlank(message = "账号不能为空", groups = {Register.class})
    private String account;
    /**
     * 密码
     */
    private String password;
    /**
     * 验证码
     */
    private String verificationCode;
}
