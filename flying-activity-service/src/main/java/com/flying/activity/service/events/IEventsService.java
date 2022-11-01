package com.flying.activity.service.events;

import com.alibaba.fastjson.JSONObject;
import com.flying.activity.common.enums.EventType;

/**
 * 事件服务
 *
 * @author Feixiang.Jiao
 * @date 2022-11-01 10:00
 * @since 1.0
 */
public interface IEventsService {

    /**
     * 创建一条事件记录
     *
     * @param create    事件详情
     * @param eventType 事件类型
     * @return 数据记录id
     */
    Long create(EventBO create, EventType eventType);

    /**
     * 根据id获取事件信息
     *
     * @param id id
     * @return 事件信息
     */
    EventBO getById(Long id);

    /**
     * 更新扩展属性，采用全覆盖方式
     *
     * @param properties 扩展属性
     * @param id         id
     * @return 更新记录条数
     */
    int updatePropertiesById(JSONObject properties, Long id);


}
