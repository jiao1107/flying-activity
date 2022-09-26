package com.flying.activity.service.goods.ratio;

import lombok.Data;

/**
 * 物品概率类
 *
 * @author Feixiang.Jiao
 * @date 2022-09-26 16:53
 * @since 1.0
 */
@Data
public class GoodsRatioBO {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 活动id
     */
    private Long activityId;

    /**
     * 物品id
     */
    private Long goodsId;

    /**
     * 概率
     */
    private Double probability;

    /**
     * 是否默认物品
     */
    private Boolean isDefault;

    /**
     * 保底
     */
    private Integer guaranteed;

}
