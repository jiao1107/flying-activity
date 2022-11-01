package com.flying.activity.service.events.impl;

import com.alibaba.fastjson.JSONObject;
import com.flying.activity.common.enums.EventType;
import com.flying.activity.service.events.EventAfter;
import com.flying.activity.service.events.EventBO;
import com.flying.activity.service.events.EventBefore;
import com.flying.activity.service.events.IEventsService;
import com.flying.activity.service.events.handler.IEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 事件服务实现
 *
 * @author Feixiang.Jiao
 * @date 2022-11-01 10:01
 * @since 1.0
 */
@Slf4j
@Service
public class EventsServiceImpl implements IEventsService, ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;


    @Override
    public Long create(EventBO create, EventType eventType) {
        create.setEventType(eventType.name());
        try {
            // lock
            EventBO exist = this.exist(create);
            if (exist != null) {
                return exist.getId();
            }
            // 进行save记录
            Long id = this.save(create);
            applicationEventPublisher.publishEvent(new EventBefore(this, id, eventType));
            // 根据不同的类型，进行一些update操作处理
            applicationEventPublisher.publishEvent(new EventAfter(this, id, eventType));
            return id;
        } finally {
            // unlock
        }
    }

    @Override
    public EventBO getById(Long id) {
        return new EventBO().setId(id);
    }

    @Override
    public int updatePropertiesById(JSONObject properties, Long id) {
        return 0;
    }

    /**
     * 初始化spring事件发送
     *
     * @param applicationEventPublisher 事件发送
     */
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    private EventBO exist(EventBO create) {
        // todo query from db
        return create;
    }

    private Long save(EventBO create) {

        return create.getId();
    }

}
