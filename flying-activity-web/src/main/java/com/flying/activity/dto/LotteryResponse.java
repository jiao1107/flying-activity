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

    private Long id;

    private String goodsCode;

    private String goodsName;

}
