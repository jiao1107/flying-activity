package com.flying.activity.service.integration;

import com.flying.activity.service.users.UserRegisterEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;

/**
 * 邮箱服务
 *
 * @author Feixiang.Jiao
 * @date 2022-09-01 14:19
 * @since 1.0
 */
public class EmailService implements ApplicationListener<UserRegisterEvent> {

    private Logger logger = LoggerFactory.getLogger(EmailService.class);

    @Override
    public void onApplicationEvent(UserRegisterEvent event) {
        logger.info("-----------------收到用户注册请求，开始发送邮件");
    }

}
