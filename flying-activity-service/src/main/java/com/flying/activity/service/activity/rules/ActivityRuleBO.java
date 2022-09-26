package com.flying.activity.service.activity.rules;

import lombok.Data;

import java.util.Date;

/**
 * 活动规则类
 *
 * @author Feixiang.Jiao
 * @date 2022-09-21 12:24
 * @since 1.0
 */
@Data
public class ActivityRuleBO {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

}
