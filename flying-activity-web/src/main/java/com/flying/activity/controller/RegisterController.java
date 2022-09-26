package com.flying.activity.controller;

import cn.hutool.core.bean.BeanUtil;
import com.flying.common.constants.DataResult;
import com.flying.activity.common.enums.Rarity;
import com.flying.activity.common.utils.KeyHelper;
import com.flying.activity.dto.PwdChangeReq;
import com.flying.activity.dto.PwdRetrieveReq;
import com.flying.activity.dto.RegisterReq;
import com.flying.activity.dto.VerificationCodeReq;
import com.flying.activity.service.activity.ActivityBO;
import com.flying.activity.service.activity.ActivityService;
import com.flying.activity.service.integration.VerificationCodeService;
import com.flying.activity.service.activity.rules.ActivityRuleService;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 注册相关服务
 *
 * @author Feixiang.Jiao
 * @date 2022-08-22 12:18
 * @since 1.0
 */
@RestController
@RequestMapping
public class RegisterController {

    private static Logger logger = LoggerFactory.getLogger(RegisterController.class);
    private Cache<String, String> verifyCodeCache = CacheBuilder.newBuilder().build();

    @Resource
    private ActivityService accountsService;
    @Resource
    private ActivityRuleService pwdService;
    @Resource
    private VerificationCodeService verificationCodeService;


    /**
     * 注册
     *
     * @param type     类型
     * @param register 注册请求参数
     * @return 注册成功，返回token
     */
    @PostMapping(value = "/register/{type}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public DataResult<Void> register(@PathVariable(required = false) String type,
                                     @RequestBody RegisterReq register) {
        this.registerPreCheck(register);
        this.verifyCode(register);

        accountsService.register(BeanUtil.copyProperties(register, ActivityBO.class));
        return DataResult.success();
    }

    /**
     * 修改密码
     *
     * @param pwdChange 修改密码参数
     * @return 修改成功/失败
     */
    @PostMapping(value = "/pwd/change", produces = {MediaType.APPLICATION_JSON_VALUE})
    public DataResult<Void> change(@Valid @RequestBody PwdChangeReq pwdChange) {

        pwdService.changePwd(pwdChange.getAccount(),
                pwdChange.getOldPwd(),
                pwdChange.getNewPwd());
        return DataResult.success();
    }

    /**
     * 找回密码
     *
     * @return 修改成功/失败
     */
    @PostMapping(value = "/pwd/retrieve", produces = {MediaType.APPLICATION_JSON_VALUE})
    public DataResult<Void> retrieve(@RequestBody PwdRetrieveReq pwdRetrieve) {

        return DataResult.success();
    }

    /**
     * 验证码发送
     *
     * @param verificationCode 请求参数
     * @return 发送结果
     */
    @PostMapping(value = "/verification/send", produces = {MediaType.APPLICATION_JSON_VALUE})
    public DataResult<Void> sendVerificationCode(@RequestBody VerificationCodeReq verificationCode) {
        String verifyCode = verificationCodeService.sendVerificationCode(verificationCode.getPhone());
        String key = KeyHelper.assembleKey(verificationCode.getType(), verificationCode.getPhone());
        verifyCodeCache.put(key, verifyCode);
        return DataResult.success();
    }


    private void registerPreCheck(RegisterReq registerReq) {
        if (StringUtils.isBlank(registerReq.getPassword()) && StringUtils.isBlank(registerReq.getVerificationCode())) {
            throw new RuntimeException("参数不能都为空");
        }
    }

    private void verifyCode(RegisterReq registerReq) {
        // 校验验证码
        if (StringUtils.isNotBlank(registerReq.getVerificationCode())) {
            String key = KeyHelper.assembleKey(Rarity.register.name(), registerReq.getAccount());
            String verifyCode = verifyCodeCache.getIfPresent(key);
            if (verifyCode == null) {
                throw new RuntimeException("");
            }

        }
    }

}
