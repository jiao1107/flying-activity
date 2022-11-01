package com.flying.activity.service.events.handler.share;

import com.flying.activity.common.enums.EventType;
import com.flying.activity.service.events.EventBefore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 分享前置处理器
 *
 * @author Feixiang.Jiao
 * @date 2022-11-01 11:45
 * @since 1.0
 */
@Slf4j
@Component
public class ShareBeforeHandler implements ApplicationListener<EventBefore> {

    @Override
    public void onApplicationEvent(EventBefore event) {
        if (event.getEventType() != EventType.share) {
            return;
        }

        log.info("shareBeforeHandler start deal event ID[{}] type [{}]", event.getEventId(), event.getEventType());


    }

}
