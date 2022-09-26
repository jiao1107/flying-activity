package com.flying.activity.service.lottery.records;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * 用户注册事件
 *
 * @author Feixiang.Jiao
 * @date 2022-09-01 14:11
 * @since 1.0
 */
public class UserRegisterEvent extends ApplicationEvent {

    @Getter
    private String account;

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public UserRegisterEvent(Object source) {
        super(source);
    }

    public UserRegisterEvent(Object source, String account) {
        super(source);
        this.account = account;
    }

}
