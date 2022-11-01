package com.flying.activity.service.events;

import com.flying.activity.common.enums.EventType;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * 事件前置处理器
 *
 * @author Feixiang.Jiao
 * @date 2022-11-01 10:16
 * @since 1.0
 */
@Getter
public class EventBefore extends ApplicationEvent {


    private Long eventId;
    private EventType eventType;


    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public EventBefore(Object source) {
        super(source);
    }

    public EventBefore(Object source, Long eventId, EventType eventType) {
        super(source);
        this.eventId = eventId;
        this.eventType = eventType;
    }

}
