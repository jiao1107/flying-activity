package com.flying.activity.service.events;

import com.flying.activity.common.enums.EventType;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * 事件后置处理器
 *
 * @author Feixiang.Jiao
 * @date 2022-11-01 10:23
 * @since 1.0
 */
@Getter
public class EventAfter extends ApplicationEvent {

    private Long eventId;
    private EventType eventType;


    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public EventAfter(Object source) {
        super(source);
    }

    public EventAfter(Object source, Long eventId, EventType eventType) {
        super(source);
        this.eventId = eventId;
        this.eventType = eventType;
    }

}
