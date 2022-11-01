package com.flying.activity.service.events.handler.help;

import com.flying.activity.common.enums.EventType;
import com.flying.activity.service.events.EventAfter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * 助力后置处理器
 *
 * @author Feixiang.Jiao
 * @date 2022-11-01 14:48
 * @since 1.0
 */
@Slf4j
@Service
public class HelpAfterHandler implements ApplicationListener<EventAfter> {

    @Override
    public void onApplicationEvent(EventAfter event) {
        if (event.getEventType() != EventType.help) {
            return;
        }

        log.info("helpAfterHandler start deal event ID[{}] type [{}]", event.getEventId(), event.getEventType());
        // 助力的
    }


}
