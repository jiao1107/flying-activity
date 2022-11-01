package com.flying.activity.service.events;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 事件BO
 *
 * @author Feixiang.Jiao
 * @date 2022-11-01 10:02
 * @since 1.0
 */
@Data
@Accessors(chain = true)
public class EventBO {

    private Long id;

    private Long actId;

    private Long userId;

    private String eventType;

    private Date createTime;

    private Date updateTime;

    private Long customerId;

    private JSONObject properties;

}
