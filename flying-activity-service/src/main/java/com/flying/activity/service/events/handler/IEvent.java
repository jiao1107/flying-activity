package com.flying.activity.service.events.handler;

import com.flying.activity.common.enums.EventType;

/**
 * 事件顶级定义
 *
 * @author Feixiang.Jiao
 * @date 2022-11-01 15:47
 * @since 1.0
 */
public interface IEvent {

    /**
     * 事件id
     *
     * @return
     */
    Long eventId();

    /**
     * 事件类型
     *
     * @return
     */
    EventType eventType();

}
