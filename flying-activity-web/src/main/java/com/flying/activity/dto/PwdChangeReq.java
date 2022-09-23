package com.flying.activity.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 修改密码请求
 *
 * @author Feixiang.Jiao
 * @date 2022-08-22 15:45
 * @since 1.0
 */
@Data
public class PwdChangeReq {
    /**
     * 账号
     */
    @NotBlank(message = "账号不能为空")
    private String account;
    /**
     * 旧密码
     */
    @NotBlank(message = "旧密码不能为空")
    private String oldPwd;
    /**
     * 新密码
     */
    @NotBlank(message = "新密码不能为空")
    private String newPwd;
    /**
     * 确认新密码
     */
    @NotBlank(message = "确认密码不能为空")
    private String confirmPwd;
}
