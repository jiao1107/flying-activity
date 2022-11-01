package com.flying.activity.service.events.handler.daily.login;

import com.flying.activity.common.enums.EventType;
import com.flying.activity.service.events.EventBefore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * 每日登陆前置处理，针对每日登陆，通常就是前端或者其他触发点触发之后。即表明已经进行了每日登陆，然后就需要进行相关礼品发放
 * 次数、机会等相关需要发放的操作进行发放
 *
 * @author Feixiang.Jiao
 * @date 2022-11-01 10:27
 * @since 1.0
 */
@Slf4j
@Service
public class DailyLoginBeforeHandler implements ApplicationListener<EventBefore> {


    @Override
    public void onApplicationEvent(EventBefore event) {
        if (event.getEventType() != EventType.daily_login) {
            return;
        }

        log.info("dailyLoginBeforeHandler start deal event ID[{}] type [{}]", event.getEventId(), event.getEventType());
        // 针对每日任务，进行已经发放查询

        // 查询确认没有发放，进行奖品发放

        // finish
    }

}
