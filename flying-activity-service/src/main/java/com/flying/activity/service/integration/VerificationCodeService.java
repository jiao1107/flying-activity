package com.flying.activity.service.integration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 验证码服务
 *
 * @author Feixiang.Jiao
 * @date 2022-09-13 16:12
 * @since 1.0
 */
@Component
public class VerificationCodeService {

    private Logger logger = LoggerFactory.getLogger(VerificationCodeService.class);


    /**
     * 发送，并返回验证码，如果想省事儿，也就可以直接使用返回的验证码进行逻辑处理
     * 需要严格验证，就可以调用验证码验证接口，进行验证处理
     *
     * @param phone
     * @return
     */
    public String sendVerificationCode(String phone) {
        // todo
        return null;
    }


    /**
     * 校验验证码
     *
     * @param phone
     * @param verificationCode
     */
    public void verifyCode(String phone, String verificationCode) {
        // todo
    }

}
