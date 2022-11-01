package com.flying.activity.service.events.handler.invited;

import com.flying.activity.common.enums.EventType;
import com.flying.activity.service.events.EventBefore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * 被邀请的前置处理器
 *
 * @author Feixiang.Jiao
 * @date 2022-11-01 14:49
 * @since 1.0
 */
@Slf4j
@Service
public class InvitedBeforeHandler implements ApplicationListener<EventBefore> {

    @Override
    public void onApplicationEvent(EventBefore event) {
        if (event.getEventType() != EventType.invited) {
            return;
        }

        log.info("invitedBeforeHandler start deal event ID[{}] type [{}]", event.getEventId(), event.getEventType());
    }

}
