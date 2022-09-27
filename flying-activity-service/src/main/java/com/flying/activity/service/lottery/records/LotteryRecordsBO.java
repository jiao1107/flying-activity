package com.flying.activity.service.lottery.records;

import lombok.Data;

import java.util.Date;

/**
 * 抽奖记录
 *
 * @author Feixiang.Jiao
 * @date 2022-09-20 14:28
 * @since 1.0
 */
@Data
public class LotteryRecordsBO {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 活动id
     */
    private Long activityId;

    /**
     * 物品id
     */
    private Long goodsId;

    /**
     * 创建时间
     */
    private Date createTime;

}
