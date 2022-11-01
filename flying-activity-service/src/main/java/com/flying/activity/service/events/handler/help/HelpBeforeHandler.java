package com.flying.activity.service.events.handler.help;

import com.flying.activity.common.enums.EventType;
import com.flying.activity.service.events.EventBefore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * 助力前置处理器
 *
 * @author Feixiang.Jiao
 * @date 2022-11-01 14:48
 * @since 1.0
 */
@Slf4j
@Service
public class HelpBeforeHandler implements ApplicationListener<EventBefore> {


    @Override
    public void onApplicationEvent(EventBefore event) {
        if (event.getEventType() != EventType.help) {
            return;
        }

        log.info("helpBeforeHandler start deal event ID[{}] type [{}]", event.getEventId(), event.getEventType());
        // 查询是否已经助力处理过了

        // 如
    }

}
