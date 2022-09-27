package com.flying.activity.dto;

import lombok.Data;

/**
 * 抽奖返回结果对象
 *
 * @author Feixiang.Jiao
 * @date 2022-09-26 9:25
 * @since 1.0
 */
@Data
public class LotteryResponse {

    /**
     * 物品id
     */
    private Long id;

    /**
     * 物品编码
     */
    private String goodsCode;

    /**
     * 物品名称
     */
    private String goodsName;

}
