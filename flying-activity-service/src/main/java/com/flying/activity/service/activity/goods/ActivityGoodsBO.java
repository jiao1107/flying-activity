package com.flying.activity.service.activity.goods;

import com.flying.activity.common.enums.GoodsType;
import com.flying.activity.common.enums.Rarity;
import com.flying.activity.common.enums.Status;
import lombok.Data;

/**
 * 活动商品业务对象
 *
 * @author Feixiang.Jiao
 * @date 2022-09-26 16:32
 * @since 1.0
 */
@Data
public class ActivityGoodsBO {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 物品编码
     */
    private String code;

    /**
     * 物品名称
     */
    private String name;

    /**
     * 物品类型：实物/虚拟
     */
    private GoodsType type;

    /**
     * 稀有度
     */
    private Rarity rarity;

    /**
     * 状态
     */
    private Status status;

    /**
     * 描述
     */
    private String desc;

    /**
     * 创建时间
     */
    private String createTime;

}
